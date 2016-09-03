package com.inforsiaListinterface;

import java.util.LinkedList;
import java.util.Vector;

public class VectorExample {
	
	public void addElement()
	{
		//System.out.println(obj2.capacity(3,7));
		obj2.add("Akash");
	    obj2.add("Rahul");
	    obj2.add("Sagar");
	    obj2.add("Sunil");
	    obj2.add("Raj");
	    
	}
	public void deleteElement()
	{
		obj2.remove(2);
	}
	public void displayElement()
	{
		for(String i:obj2)
		{
			System.out.println("Name :" + i );
		}
	}

	Vector<String> obj2=new Vector<String>(4,7);  //use for how many capicity ur index

}
