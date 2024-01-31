package com.xworkz.collectionlamda.things;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



public class ListRunner {
	
	public static void main(String [] args) {
		Iterable cards=new ArrayList();
		
		 List<String> list = new ArrayList<String>();  
	      list.add("IBM"); 
	      list.add("Oracle"); 
	      list.add("PWC");
	      
	      
	      ListIterator listAll=list.listIterator();
			
			
			while(listAll.hasNext()) {
				System.out.println("previous index are:"+listAll.previousIndex());
				System.out.println("reading values are:"+listAll.next());
				System.out.println(" index values  are:"+listAll.nextIndex());
				}
			
			while(listAll.hasPrevious()) {
				System.out.println("previous index are:"+listAll.previous());
			}
	      
	      
	   System.out.println("remove index value is:"+list.remove(1));
	
	      
	}
}
