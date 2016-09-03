package com.inforsiaListinterface;

import java.util.LinkedList;

public class LinkedListExample {
	
	public void addElement()
	{
		obj1.add("Akash");
	    obj1.add("Rahul");
	    obj1.add("Sagar");
	    obj1.add("Sunil");
	}
	public void deleteElement()
	{
		obj1.remove(3);
	}
	public void displayElement()
	{
		for(String i:obj1)
		{
			System.out.println("Name :" + i );
		}
	}

	LinkedList<String> obj1=new LinkedList<String>();
}
