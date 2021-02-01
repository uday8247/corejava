package javaassignments;

abstract class AbstractCheck
{
	public int a=2;
	public void Method1()
	{
		int b=100;
		System.out.println(b);
	}
	public abstract void emptyMethod1();
	public abstract int emptyMethod2();
}

abstract class emptyAbstract
{
	
}

abstract class example extends AbstractCheck
{
	
}

public class A2Q4 extends AbstractCheck
{
	public static void main(String args[])
	{
		
	}
	
	@Override
	public void emptyMethod1()
	{
		
	}
	
	@Override
	public int emptyMethod2()
	{
		return 0;
	}
	
}
