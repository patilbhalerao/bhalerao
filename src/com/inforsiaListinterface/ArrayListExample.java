package com.inforsiaListinterface;

import java.util.ArrayList;

public class ArrayListExample {

	public void addElement()
	{
	    obj.add("Bhalerao");
	    obj.add("Ravindra");
	    obj.add("Patil");
	    obj.add("Rao");
	    obj.add(null);
	    obj.add("Rao");
	    
	}
	public void deleteElement()
	{
		obj.remove(3);
	}
	public void displayElement()
	{
		//System.out.println(obj);
	//	for(int i=0;i<obj.size();i++)
	//	{
	//		System.out.println("Name :" + obj.get(i));
	//	}
		for(String i:obj)
		{
			//String original=new StringBuffer(i).reverse().toString();  //reverse character print by this statement
			System.out.println("Name :" + i );
		}
	}
	
	ArrayList<String> obj =new ArrayList<String>();
}
