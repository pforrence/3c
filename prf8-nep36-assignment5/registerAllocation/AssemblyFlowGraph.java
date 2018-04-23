package registerAllocation;

import visitor.*;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import symboltable.*;

public class AssemblyFlowGraph{
    List<Quadruple> instr;
    Hashtable<Quadruple, List<Label>> labels;
    
    List<Node> graph;
    //hashtable that keeps the Node of the label
    Hashtable<String,Integer> labelNode;
    List<List<Node>> func;
    //int countInstr;
    
    public AssemblyFlowGraph(List<Quadruple> i ,Hashtable<Quadruple, List<Label>> l){
        labels = l;
        instr = i;
        graph = new ArrayList<Node>();
        labelNode = new Hashtable<String,Integer>();
        func = new ArrayList<List<Node>>();
        
        //countInstr=0;
        
    }
    
    public List<List<Node>> buildCFG(){
        buildNodes();
        boolean isNewFunction = false;
        //String labelNewFunc;
        List<Node> auxList = new ArrayList<Node>();
        
        for (int i = 0; i < graph.size(); i++) {
            
            Node n = graph.get(i);
            
            
            if(isNewFunction){
                ////System.out.println("here");
                isNewFunction = false;
                //add the actual CFG (actual function) in the List of Lists
                func.add(auxList);
                //create a new list to keep the new function
                auxList = new ArrayList<Node>();
            }
            auxList.add(n);
            if(n.getExitFunction()){
                if(i!=graph.size()-1){
                    //the next instruction will be a new function
                    isNewFunction = true;
                }
                //it's the last node
                else{
                    func.add(auxList);
                }
                
                n.setNextNull();
                
            }
            else{
                
                //if nextLabel() is null it means that is the instruction that follows
                if(n.nextLabel()==null){
                    //if is not the last node
                    if(i != graph.size()-2){
                        Node aux = graph.get(i+1);
                        n.addNext(aux);
                    }
                }
                else{
                    List<String> strAux = n.nextLabel();
                    ////System.out.println("n: " + n);
                    ////System.out.println("strAux: "+strAux);
                    ////System.out.println("strAux.size() : "+strAux.size());
                    ////System.out.println("strAux: "+strAux);

                    for (int j = 0; j < strAux.size(); j++) {
                        ////System.out.println("j: "+ j);
                        if( (strAux.get(j)).equals("next")){
                            Node aux = graph.get(i+1);
                            n.addNext(aux);
                        }
                        else{
                            ////System.out.println("here");

                            ////System.out.println("get:" + strAux.get(j));
                            ////System.out.println("LabelNode:" + labelNode);
                            String a = "L" + j;
                            ////System.out.println("give it a shot: "+labelNode.get(a));
                            int numLabel = labelNode.get(a);
                            ////System.out.println("here");
                            n.addNext(graph.get(numLabel));
                        }
                        
                    }
                }
            }
            
        }
        
        return func;
    }
    public void buildNodes(){
        ////System.out.println("beginning: " + labelNode);

        Node n = null;
        Node aux = null;
        ////System.out.println("instr.size(): " + instr.size());

        for (int i = 0; i < instr.size(); i++) {
            Quadruple q = instr.get(i);
            ////System.out.println("q: "+q);

            ////System.out.println("labels: "+labels);

            List<Label> labelList = labels.get(q);
            ////System.out.println("labelList: "+labelList);

            //first node
            n = new Node(q,i);

            if(labelList!=null){
                ////System.out.println("me");
                for (Label l : labelList) {
                    if(l.printBefore){
                        //save label and its number
                        labelNode.put(l.getName(), i);
                    }
                    //the label can be in one line but actually represents the next one
                    else{
                        labelNode.put(l.getName(),i+1);
                    }
                }
                
            }
            else
                ////System.out.println("hesdfre");

            
            if(q instanceof UAssignmentQuad){
                if(q.getOp()==null){
                    Variable arg1 = (Variable) q.getArg1();
                    Variable arg2 = (Variable) q.getArg2();
                    if(arg1.getName().equals(arg2.getName())){
                        n.setMove();
                    }
                }
            }
            if(q instanceof CondJumpQuad ){

                //System.out.println("label: " + q.getArg1());

                String nameLabel = ((Label)q.getArg1()).getName();
                //iffalse
                n.addJumpTo(nameLabel);
                //if true
                n.addJumpTo("next");
            }
            if(q instanceof UCondJumpQuad){
                String nameLabel = ((Label)q.getOp()).getName();
                
                n.addJumpTo(nameLabel);
            }
            if(q instanceof ReturnQuad){
                n.setExitFunction();
            }
            if(q instanceof CallQuad){
                String op = (String)q.getOp();
                if(!op.equals("_system_out_println") && !op.equals("_system_exit")){
                    n.addJumpTo(op);
                    n.setJumpToFunction();
                    n.addJumpTo("next");
                }
                if(op.equals("_system_exit")){
                    n.setExitFunction();
                }
                
            }
            graph.add(n);
        }
        ////System.out.println("end: " + labelNode);

    }
    public void printGraph(List<Node> graph){
        //System.out.println("New Function");
        for (int i = 0; i < graph.size(); i++) {
            
            Node n = graph.get(i);
            System.out.print(n.getNum()+ " ");
            //System.out.println(n.getInstr().toString());
            List<Node> listN = n.nextNode();
            if(listN.size()!=0){
                
                //System.out.println("Nexts:");
                for (int j = 0; j < listN.size(); j++) {
                    System.out.print(listN.get(j).getNum()+ " ");
                    //System.out.println(listN.get(j).getInstr().toString());
                    
                }
            }
            
            
        }
        
    }
    
    
}


