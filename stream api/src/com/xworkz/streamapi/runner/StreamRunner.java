package com.xworkz.streamapi.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class StreamRunner {

	public static void main(String[] args) {
		Collection<String> collection=new ArrayList<String>();
		
		collection.add("Prashanth G V");
		collection.add("23");
		collection.add("Shivamogga");
		collection.add("Vasanthappa G");
		collection.add("Sudha B");
		collection.add("B.E");
		
		System.out.println("The overall details are:"+collection);
		
		
		collection.stream().sorted().map(String::length).forEach((System.out::println));
		
		
		collection.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);

        
        collection.stream().map(s -> s.contains("B.E")).forEach(System.out::println);

        
        collection.stream().map(String::toUpperCase).forEach(System.out::println);

        
        collection.stream().map(String::toLowerCase).forEach(System.out::println);

       
        collection.stream().map(s -> s.indexOf("a")).forEach(System.out::println);

        
        collection.stream().sorted().forEach(System.out::println);

        
        collection.stream().filter(s -> s.equals("B.E")).forEach(System.out::println);

        
        collection.stream().map(s -> s.charAt(0)).forEach(System.out::println);

        
        collection.stream().filter(s -> s.startsWith("S")).forEach(System.out::println);

        
        collection.stream().filter(s -> s.endsWith("a")).forEach(System.out::println);
        
        System.out.println("Min Length: " + collection.stream().mapToInt(String::length).min().orElse(0));

        
        System.out.println("Max Length: " +collection.stream() .mapToInt(String::length).max().orElse(0));

       
        System.out.println("Sum of Lengths: " +collection.stream().mapToInt(String::length).sum());

        
        System.out.println("Average Length: " + collection.stream().mapToInt(String::length).average().orElse(0));

        
        System.out.println("Count: " + collection.stream().count());

	}

}
