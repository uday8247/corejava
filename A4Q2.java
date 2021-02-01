package javaassignments;

import java.util.ArrayList;
import java.util.function.Predicate;

public class A4Q2
{
	private int totalPrice;
	private String status;
	
	public A4Q2(int totalPrice,String status)
	{
		super();
		this.totalPrice=totalPrice;
		this.status=status;
	}
	
	
	
/*
	public static ArrayList<Assignment4Q2> listOfOrders(ArrayList<Assignment4Q2>orders)
	{
			
	}
	*/
	
	public static void main(String args[])
	{

		ArrayList<A4Q2> price=new ArrayList<A4Q2>();
		price.add(new A4Q2(11000,"Accepted"));
		price.add(new A4Q2(20000,"Completed"));
		price.add(new A4Q2(15000,"Completed"));
		price.add(new A4Q2(8000,"Rejected"));
		price.add(new A4Q2(25000,"Completed"));
		
		Predicate<A4Q2> pr=e->(e.totalPrice>10000 && (e.status.contentEquals("Accepted") || e.status.contentEquals("Completed")));
		for (A4Q2 i:price)
		{
			if(pr.test(i))
			{
				System.out.println("price:"+i.totalPrice+ " Status:"+i.status);
			}
		}
	}
}