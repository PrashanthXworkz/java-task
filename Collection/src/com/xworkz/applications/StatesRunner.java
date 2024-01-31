package com.xworkz.applications;

import java.util.ArrayList;
import java.util.List;

public class StatesRunner {

	public static void main(String[] args) {
		List<String> statelist=new ArrayList<String>();
		statelist.add("Karnataka");
		statelist.add("Kerala");
		statelist.add("Tamilnadu");
		statelist.add("Andarapradesh");
		statelist.add("Telagana");
		statelist.add("maharashtra");
		statelist.add("UttarPradesh");
		statelist.add("HimachalPradesh");
		statelist.add("Rajastan");
		statelist.add("Jammu and Kashmir");
		statelist.add("Assam");
		statelist.add("Bihar");
		statelist.add("Goa");
		statelist.add("Delhi");
		statelist.add("arunchalPradesh");
		statelist.add("Chattishgar");
		statelist.add("Haryana");
		statelist.add("Jharkand");
		statelist.add("Madyapradesh");
		statelist.add("Manipur");
		statelist.add("Meghalaya");
		statelist.add("Mizoram");
		statelist.add("Nagland");
		statelist.add("Odissa");
		statelist.add("Punjab");
		statelist.add("Sikkim");
		statelist.add("Tripura");
		statelist.add("UttarKhand");
		statelist.add("Westbengal");
		System.out.println("State is present:"+statelist.contains("Karnataka"));
		System.out.println("food is remove:"+statelist.remove("Tamilnadu"));
		System.out.println("food size:"+statelist.size());
		
		

	}

}
