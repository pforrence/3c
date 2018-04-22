lexer_parser: ExprParser.cup ExprLex.flex java-cup-11a.jar
	jflex ExprLex.flex
	java -jar java-cup-11a.jar -interface -parser ExprParser ExprParser.cup
	javac registerAllocation/*.java
	javac syntaxtree/*.java
	javac symboltable/*.java
	javac visitor/*.java
	javac endCode/*.java
	javac CodeGeneration.java

compiler: Compiler.java ExprParser.java ExprLex.java 
	javac Compiler.java 

clean: 
	$(RM) *.class
	$(RM) symboltable/*.class
	$(RM) syntaxtree/*.class
	$(RM) visitor/*.class
	$(RM) registerAllocation/*.class
	$(RM) endCode/*.class
	$(RM) ExprLex.java
	$(RM) ExprParser.java
