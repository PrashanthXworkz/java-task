package com.xworkz.streamoperations.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


import com.xworkz.streamoperations.dto.Road;



public class RoadRunner {

	public static void main(String[] args) {
		List<Road> roadList = new ArrayList<Road>();
        roadList.add(new Road("rast",60,"Banglore",true));
        roadList.add(new Road("Mahavir",100,"Tumkur",false));
        roadList.add(new Road("Samige",85,"Gadag",true));
        roadList.add(new Road("koduge",40,"Udupi",true));
        roadList.add(new Road("savinaya",90,"Mysore",false));
        roadList.add(new Road("ringroad",120,"Manglore",true));
        
        
        List<Road> distinctList = roadList.stream().distinct() .collect(Collectors.toList());
        System.out.println("Distinct List: " + distinctList);
    
        List<Road> matchedList = roadList.stream().filter(dto -> dto.getLocation().equals("Udupi"))
                .collect(Collectors.toList());
        System.out.println("Matched List: " + matchedList);
        
        List<Road> starMatchedList = roadList.stream()
                .filter(dto -> dto.getProjectName().equals("star"))
                .collect(Collectors.toList());
        System.out.println("Star Matched List: " + starMatchedList);

        
        List<Road> containsAMatchedList = roadList.stream()
                .filter(dto -> dto.getProjectName().contains("a"))
                .collect(Collectors.toList());
        System.out.println("Contains 'A' Matched List: " + containsAMatchedList);

       
        List<Road> startsWithDList = roadList.stream()
                .filter(dto -> dto.getLocation().startsWith("M"))
                .collect(Collectors.toList());
        System.out.println("Starts with 'D' List: " + startsWithDList);
        
        List<Road> endsWithAList = roadList.stream()
                .filter(dto -> dto.getLocation().endsWith("g"))
                .collect(Collectors.toList());
        System.out.println("Ends with 'A' List: " + endsWithAList);

   
        Optional<Road> firstDto = roadList.stream().findFirst();
        System.out.println("First DTO: " + firstDto);

        
        Optional<Road> anyDto = roadList.stream().findAny();
        System.out.println("Any DTO: " + anyDto);

        
        boolean anyMatch = roadList.stream().anyMatch(dto -> dto.getProjectName().equals("rast"));
        System.out.println("Any Match: " + anyMatch);

      
        boolean allMatch = roadList.stream().allMatch(dto -> dto.getLocation().contains("gadag"));
        System.out.println("All Match: " + allMatch);

	}

}
