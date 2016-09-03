package com.inforsiaMapsinterface;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class LinkedHashMapExample {
	
	public void addElement()
	{
		obj8.put(0,1);
		obj8.put(1,1);
	    obj8.put(2,2);
	    obj8.put(3,3);
	    obj8.put(4,3);
	    obj8.put(5,4);//not print dublicate value
	   // obj7.put(null, null);  // not printing null value
	    
	
	    
	}
	public void deleteElement()
	{
		obj8.remove(0);
	}
	public void displayElement()
	{
		Set<Integer>key=obj8.keySet();
		for(int a:key)
		{
			System.out.println(a);
		}
		//System.out.println(obj6.keySet());
		/*for(String i:obj6)
		{
			System.out.println("Play :" + i );
		}*/
	}

	LinkedHashMap<Integer,Integer> obj8=new LinkedHashMap<Integer,Integer>(); 

}
