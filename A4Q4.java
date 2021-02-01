package javaassignments;

import java.util.ArrayList;

public class A4Q4 
{
	public ArrayList<String> removeOddLength(ArrayList<String> employeeList)
	{
		employeeList.removeIf(e->e.length()%2!=0);
		for(String s:employeeList)
		{
			System.out.println(s);
		}
		return employeeList;
	}
	
	public static void main(String args[])
	{
		ArrayList<String> emp=new ArrayList<String>();
		emp.add("uday");
		emp.add("kumar");
		emp.add("venkat");
		emp.add("rajesh");
		
		A4Q4 A=new A4Q4();
		A.removeOddLength(emp);
	}
}