package com.xworkz.driver;

import java.util.ArrayList;

import java.util.List;

public class ArrayListRunner {

	public static void main(String[] args) {
		List<Integer> collection=new ArrayList<Integer>();
		collection.add(30);
		collection.add(34);
		collection.add(43);
		collection.add(42);
		collection.add(23);
		collection.add(54);
		
		System.out.println("values are:"+collection);
		
		int sum=0;
		
		for(int result:collection) {
		int s= sum+collection.get(result);
		System.out.println(s);
		}
		
		
		
		
	
		
		
		

	}

}
