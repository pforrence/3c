import java_cup.runtime.*;
import java.io.*;
import java.util.*;
import visitor.*;
import syntaxtree.*;
import symboltable.*;
import registerAllocation.*;
import endCode.*;
import java.util.*;

public class Compiler {
	public static void main(String[] args) {
		if(args.length != 1) {
			System.err.println("ERROR: Invalid number of command line arguments.");
			System.exit(1);
		}
		Symbol parse_tree = null;
		try {
			/*Parsing Phase*/

            Reader reader = new java.io.InputStreamReader(new java.io.FileInputStream(args[0]));
            ExprParser parser = new ExprParser(new ExprLex(reader));
            parse_tree = parser.parse();
            	
            //symboltable = new symboltablevisitor();
            Program program = ((Program) parse_tree.value);
            
            if(program != null) {
                
                //Visit the tree starting at root (program) to build the symbol table
                BuildSymbolTableVisitor bstVisitor = new BuildSymbolTableVisitor();
                bstVisitor.visit(program);
                
                //Get a copy of the symboltable
                Scope symbolTable = bstVisitor.getFirstScope();
                
                if(symbolTable == null) //Check for error making symbol table
                {
                    System.err.println("Oh no... the symbol table is null!");
                    return;
                }
                //symbolTable.print(0);
                //Visit the tree starting at the root to check for undefined variables
                UndefinedVariableVisitor undefinedVisitor = new UndefinedVariableVisitor(symbolTable);
                undefinedVisitor.visit(program);
                
                //Visit the tree starting at the root to check for type errors
                TypeCheckingVisitor typeCheckVisitor = new TypeCheckingVisitor(symbolTable);
                typeCheckVisitor.visit(program);
                
                //If any errors occured, do not generate IR
                if(bstVisitor.errorDetected || undefinedVisitor.errorDetected || typeCheckVisitor.errorDetected)
                {
                    return;
                }
                
                //program.accept(new IRVisitor(symboltable));
                //program.accept(new IRVisitor());
                IRVisitor IRVisit = new IRVisitor(symbolTable);
                IRVisit.visit(program);
                //System.out.println("Three Address Code: ");
                //program.accept(IRVisit);
                /*for(int i = 0; i < ((IRVisitor)IRVisit).IR.size(); i++)
                    System.out.println(((IRVisitor)IRVisit).IR.get(i));
                ((IRVisitor)IRVisit).reset();*/
                
                List<Quadruple> IRList = IRVisit.getIR();
                System.out.println("IR: " + IRList);

                Hashtable<Quadruple, List<Label>> labels = IRVisit.getLabels();
                System.out.println("Initial labels: " + labels);
                System.out.println();
                System.out.println();
                HashMap<String, String> workList = IRVisit.getWorkList();
                
                //Temporary reg allocation
                RegisterAllocator allocator = new RegisterAllocator();
                
                SymbolTable symTable = (SymbolTable)symbolTable;
                Hashtable <String, ClassSymbolTable> classes = symTable.getClasses();
                List<String> keys = Helper.keysToSortedList(classes.keySet());;
                
                for(int i = 0; i < keys.size(); i++)     //Iterate over each class
                {
                    ClassSymbolTable classSymTable = classes.get(keys.get(i));
                    classSymTable.calculateVarOffsets(); //Store variable offsets in the symbol table
                    
                    Hashtable<String, MethodSymbolTable> methods = classSymTable.getMethods();
                    List<String> methodKeys = Helper.keysToSortedList(methods.keySet());
                    
                    for(int j = 0; j < methodKeys.size(); j++)
                    {
                        MethodSymbolTable methSymTable = methods.get(methodKeys.get(j));
                        methSymTable.assignRegisters(allocator); //Temporary allocation to all method locals
                    }
                }
                //End temp reg allocation
                
                //Backpatch the IR to resolve labels in jumps to methods
                //BackPatcher backPatch = new BackPatcher(IRList, workList);
                //backPatch.patch();
                
                //Allocate Registers - Not complete (Inteferences are buggy and no coloring/allocation yet)
                AssemblyFlowGraph asmFG = new AssemblyFlowGraph(IRList, labels);
                List<List<Node>> func = asmFG.buildCFG();
                System.out.println(func);
                /*for (int i = 0; i < func.size(); i++)
                {
                    Liveness liv = new Liveness(func.get(i));
                    liv.calculateLive();
                    List<BitSet> liveOut = liv.getLiveOut();
                    InterferenceGraph iG = new InterferenceGraph(func.get(i),liveOut, liv.getAllVariables());
                    //iG.buildInterferenceGraph();
                }*/
                
                //Create output file
                String fileName = args[0].substring(0, args[0].lastIndexOf(".")) + ".asm";
                
                //Write MIPS
                CodeGeneration gen = new CodeGeneration(IRList, labels, allocator, symTable, fileName, IRVisit);
                gen.generateMIPS();
                
                
                //Link runtime.asm file
                endCodeConcat linker = new endCodeConcat("endCode/runtime.asm", fileName);
                linker.concat();
                
            }

		} catch (IOException e) {
			System.err.println("ERROR: Unable to open file: " + args[0]);
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}
}
