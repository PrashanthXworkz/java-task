package com.xworkz.collectionlamda.things;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ListIterator;

public class CollectionRunner {

	public static void main(String[] args) {
		Collection collection =new ArrayList();
		collection.add("PESITM");
		collection.add("JNNCE");
		collection.add("sridevi");
		collection.add("RV");
		
		
		System.out.println("is there value:"+collection.contains("JNNCE"));
		
		System.out.println("size of list:"+collection.size());
		
		System.out.println("value is"+collection.isEmpty());
		
		System.out.println(" hash code value is"+collection.hashCode());
		
		System.out.println("value is:"+collection.equals("RV"));
		
		System.out.println("iterator value is"+collection.iterator());
		
		System.out.println("all value present:"+collection.containsAll(collection));
		
		collection.clear();
		
		
		
		
		
		

		
		
		

	}

}
