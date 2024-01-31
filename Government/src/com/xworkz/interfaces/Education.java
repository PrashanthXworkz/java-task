package com.xworkz.interfaces;

public interface Education extends EduactionRules {
   String eduState="karnataka";
   
   public static void eduGoverment(String party) {
	   party="congress";
	   System.out.println("party is done");
   }
   
   public static void qualification(String course) {
	   course="BE";
	   System.out.println("cousre is completed"); 
	  
   }
}
