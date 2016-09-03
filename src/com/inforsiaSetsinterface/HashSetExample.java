package com.inforsiaSetsinterface;

import java.util.HashSet;
import java.util.Vector;

public class HashSetExample {
	
	public void addElement()
	{
		
		obj3.add("Cricket");
	    obj3.add("Hollyball");
	    obj3.add("Jimnastic");
	    obj3.add("Kho-Kho");
	    
	    
	}
	public void deleteElement()
	{
		obj3.remove("Cricket");
	}
	public void displayElement()
	{
		for(String i:obj3)
		{
			System.out.println("Play :" + i );
		}
	}

	HashSet<String> obj3=new HashSet<String>(); //not mentaine insertion order,not adding duplicate value

}
