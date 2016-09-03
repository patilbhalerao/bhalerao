package com.inforsiaSetsinterface;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetExample {
	
	public void addElement()
	{
		
		obj5.add("Cricket");
	    obj5.add("Apple");
	    obj5.add("Dianose");
	    obj5.add("Kho-Kho");
	    obj5.add("Kho-Kho");//not print dublicate value
	    obj5.add(null);  // not printing null value
	    
	    
	}
	public void deleteElement()
	{
		obj5.remove("Cricket");
	}
	public void displayElement()
	{
		for(String i:obj5)
		{
			System.out.println("Play :" + i );
		}
	}

	LinkedHashSet<String> obj5=new LinkedHashSet<String>(); 

}
