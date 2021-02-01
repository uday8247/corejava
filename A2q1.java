package javaassignments;

class SingletonInheritanceCheck
{
	
	private static SingletonInheritanceCheck instance=null;
	public String check;
	private SingletonInheritanceCheck()
	{
		check="my singleton";
		
	}
	
	public static SingletonInheritanceCheck getInstance()
	{
		if(instance==null)
		{
			instance=new SingletonInheritanceCheck();
		}
		
		return instance;
	}
	
	
}


public class A2q1 
{
public static void main(String[] args)
{
	
}
}