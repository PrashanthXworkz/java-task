package com.xworkz.applications;

import java.util.ArrayList;
import java.util.Collection;

public class Collection2Runner {

	public static void main(String[] args) {
		Collection<String> collection=new ArrayList<String>();
		collection.add("Java");
		collection.add("Sql");
		System.out.println("Data are:"+collection);
		collection.addAll(collection);
		System.out.println("values are:"+collection);
		collection.contains("Sql");
		System.out.println("object is:"+collection);
		collection.containsAll(collection);
		System.out.println("values are:"+collection);
		
		collection.equals(collection);
		System.out.println("values is:"+collection);
		collection.hashCode();
		System.out.println("values:"+collection);
		collection.isEmpty();
		System.out.println("is empty:"+collection);
		collection.iterator();
		collection.parallelStream();
		collection.remove("Sql");
		System.out.println("values are:"+collection);
		collection.removeAll(collection);
		System.out.println("values will remove:"+collection);
		collection.removeIf(null);
		collection.retainAll(collection);
		collection.retainAll(collection);
		collection.size();
		collection.spliterator();
		collection.stream();
		collection.toArray();
		collection.clear();
		System.out.println("values are:"+collection);
		
		
		
		
		
		

	}

}
