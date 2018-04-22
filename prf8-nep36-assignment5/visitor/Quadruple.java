package visitor;

public abstract class Quadruple {
    Object operator;
    Object argument1;
    Object argument2;
    Object result;

    public abstract String toString();
    
    public Object getOp()
    {
        return operator;
    }
    
    public Object getArg1()
    {
        return argument1;
    }
    
    public Object getArg2()
    {
        return argument2;
    }
    
    public Object getResult()
    {
        return result;
    }
    
    public void setOp(Object o)
    {
        operator = o;
    }
    
    public void setArg1(Object o)
    {
        argument1 = o;
    }
    
    public void setArg2(Object o)
    {
        argument2 = o;
    }
    
    public void setResult(Object o)
    {
        result = o;
    }
}
