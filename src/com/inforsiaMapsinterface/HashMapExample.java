package com.inforsiaMapsinterface;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashMapExample {

	public void addElement()
	{
		
		obj6.put("String","Cricket");
	    obj6.put("String1","Apple");
	    obj6.put("String2","Dianose");
	    obj6.put("String3","Kho-Kho");
	    obj6.put("String4","Kho-Kho");//not print dublicate value
	    obj6.put(null, null);  // not printing null value
	    
	    
	}
	public void deleteElement()
	{
		obj6.remove("Cricket");
	}
	public void displayElement()
	{
		Set<String>key=obj6.keySet();
		for(String a:key)
		{
			System.out.println(a);
		}
		//System.out.println(obj6.keySet());
		/*for(String i:obj6)
		{
			System.out.println("Play :" + i );
		}*/
	}

	HashMap<String,String> obj6=new HashMap<String,String>(); 
}
