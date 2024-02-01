package com.xworkz.LinkedList.driver;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<String> movieNames=new LinkedList<String>();
		
		movieNames.add("katera");
		movieNames.add("Tagaru Palya");
		System.out.println("the elements are:"+movieNames);
		
		movieNames.add(2,"salar");
		System.out.println("based on index value:"+movieNames);
		
		movieNames.addFirst("Tarak");
		System.out.println("first value:"+movieNames);
		movieNames.addLast("Upadyaksha");
		System.out.println("last value:"+movieNames);
		
		
		System.out.println("value is present:"+movieNames.contains("salar"));
		
		System.out.println("based on index:"+movieNames.indexOf("katera"));
		
		System.out.println("remove value :"+movieNames.remove("Tarak"));
		
		System.out.println("remove value :"+movieNames.removeFirstOccurrence("Tarak"));
		
		System.out.println("size value is :"+movieNames.size());
		
		System.out.println("remove value :"+movieNames.set(1,"Tagaru Palya"));

	}

}
