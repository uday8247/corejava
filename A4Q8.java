package javaassignments;

import java.util.Arrays;
import java.util.List;

public class A4Q8 
{
	public static void main(String args[])
	{
	List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
	new Thread(()->list.forEach(n-> System.out.println(n))).start();
	}

}