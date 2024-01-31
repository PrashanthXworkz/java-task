package com.xworkz.collectionlamda.things;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ArrayListRunner {
	
	    public static void main(String[] args) {
	        List<String> arrayList = new ArrayList<>();

	        arrayList.add("Siddaramyya");
	        arrayList.add("stalin");
	        arrayList.add("reddy");
	        arrayList.add("Nithis jadav");

	        System.out.println("Original ArrayList: " + arrayList);

	        arrayList.add(2, "shetter");
	        System.out.println("ArrayList after adding 'Mango' at index 2: " + arrayList);
	        
	        arrayList.remove("reddy");
	        System.out.println("ArrayList after removing 'Banana': " + arrayList);
	        
	        arrayList.remove(1);
	        System.out.println("ArrayList after removing element at index 1: " + arrayList);

	       
	        System.out.print("Elements using for-each loop: ");
	        for (String cm : arrayList) {
	            System.out.print(cm + " ");
	        }
	        System.out.println();

	        
	        Collections.sort(arrayList);
	        System.out.println("Sorted ArrayList: " + arrayList);

	        
	        Collections.reverse(arrayList);
	        System.out.println("Reversed ArrayList: " + arrayList);

	        
	        Collections.shuffle(arrayList);
	        System.out.println("Shuffled ArrayList: " + arrayList);

	        
	        System.out.println("Does the ArrayList contain 'stalin'? " + arrayList.contains("stalin"));

	        
	        System.out.println("Size of the ArrayList: " + arrayList.size());
	        
           ListIterator listAll=arrayList.listIterator();
			
			
			while(listAll.hasNext()) {
				System.out.println("previous index are:"+listAll.previousIndex());
				System.out.println("reading values are:"+listAll.next());
				System.out.println(" index values  are:"+listAll.nextIndex());
				}
			
			while(listAll.hasPrevious()) {
				System.out.println("previous index are:"+listAll.previous());
			}
	        

	 
	        arrayList.clear();
	        System.out.println("ArrayList after clearing: " + arrayList);
	        
	        
             
	    }
	}


