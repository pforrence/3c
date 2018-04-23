README.md

Make and run our program

1. make clean
//before recompiling, always make clean to clear any rubbish files

2. make lexer_parser
//build the lexer and parser with their specific engines

3. make compiler
//compile the Compiler.java file

4. java Compiler file.java
//run a test file and see the magic happen! This will output the .asm file for Mars.
//The example files for this project are located in the tests folder. Milestones 1-5 are 
//included and implemented already. For example, if you were testing milestone 1, you 
//would run the following command
//java Compiler tests/Milestone1.java

5. java -jar Mars4_5.jar file.asm
//Run the program in Mars to see what will happen! The example files for this project are 
//located in the tests folder. Milestones 1-5 are included already. For example, if you were testing milestone 1, you 
//would run the following command
// java -jar Mars4_5.jar tests/Milestone1.asm
