package com.xworkz.collectionlamda.things;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class IterableRunner {

	public static void main(String[] args) {
		 
        List<String> arrayList = new ArrayList<>();

        
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");

       
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

       
        System.out.println("\nIterating using for-each loop:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

	}

}
