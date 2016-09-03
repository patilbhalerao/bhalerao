package com.inforsiaMapsinterface;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public void addElement()
	{
		obj7.put(0,1);
		obj7.put(1,1);
	    obj7.put(2,2);
	    obj7.put(3,3);
	    obj7.put(4,3);
	    obj7.put(5,4);//not print dublicate value
	   // obj7.put(null, null);  // not printing null value
	    
	
	    
	}
	public void deleteElement()
	{
		obj7.remove(0);
	}
	public void displayElement()
	{
		Set<Integer>key=obj7.keySet();
		for(int a:key)
		{
			System.out.println(obj7.get(a));
		}
		//System.out.println(obj6.keySet());
		/*for(String i:obj6)
		{
			System.out.println("Play :" + i );
		}*/
	}

	TreeMap<Integer,Integer> obj7=new TreeMap<Integer,Integer>(); 
}
