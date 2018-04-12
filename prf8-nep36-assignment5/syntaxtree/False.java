package syntaxtree;
import visitor.Visitor;
import visitor.TypeVisitor;
import symboltable.Variable;

public class False extends Exp {
  public void accept(Visitor v) {
    v.visit(this);
  }

  public Type accept(TypeVisitor v) {
    return v.visit(this);
  }
  public Variable getVar()
  {
	  return new Variable("false", "const");
  }
}
