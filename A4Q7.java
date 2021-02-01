package javaassignments;

import java.util.HashMap;

public class A4Q7
{
	public static void main(String args[])
	{
		
	}
	
	public String ConvertKeyValueToString(HashMap<String,Integer>map)
	{
		StringBuilder mapAsString=new StringBuilder();
		for(HashMap.Entry<String,Integer> mp:map.entrySet())
		{
			mapAsString.append(mp.getKey()+mp.getValue());
		}
		return mapAsString.toString();
		
	}
}