package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Poonm");
		al.add("Priyanka");
		al.add("Rutuja");
		al.add("Vaishali");
		
		System.out.println(al);
	Iterator	<String> itr=al.iterator();
		{
			while(itr.hasNext());
			System.out.println(itr.next());
		}
		
	}

}
