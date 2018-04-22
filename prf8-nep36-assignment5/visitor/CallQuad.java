package visitor;
public class CallQuad extends Quadruple
{
	public CallQuad(Object name, Object arg1, Object ret)
	{
		operator = name;
		argument1 = arg1;
		result = ret;
	}
	@Override
    public String toString() {
        return "call " + operator + ", " + argument1;
    }
}