package com.inforsiaSetsinterface;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetExample {
	
	public void addElement()
	{
		
		obj4.add("Cricket");
	    obj4.add("Apple");
	    obj4.add("Dianose");
	    obj4.add("Kho-Kho");
	    //obj4.add(null);  // not printing null value
	    
	    
	}
	public void deleteElement()
	{
		//obj4.remove("Cricket");
	}
	public void displayElement()
	{
		for(String i:obj4)
		{
			System.out.println("Play :" + i );
		}
	}

	TreeSet <String> obj4=new TreeSet<String>(); 

}
