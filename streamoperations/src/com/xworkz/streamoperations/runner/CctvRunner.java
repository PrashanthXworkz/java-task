package com.xworkz.streamoperations.runner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.xworkz.streamoperations.dto.CCTVDto;

public class CctvRunner {

	public static void main(String[] args) {
		 List<CCTVDto> cctvList = new ArrayList<>();
	        cctvList.add(new CCTVDto("A", "Rights1", "Studios1", "Presence1", "Media1"));
	        cctvList.add(new CCTVDto("B", "Rights2", "Studios2", "Presence2", "Media2"));
	        cctvList.add(new CCTVDto("C", "Rights3", "Studios3", "Presence3", "Media3"));
	        cctvList.add(new CCTVDto("D", "Rights4", "Studios4", "Presence4", "Media4"));
	        cctvList.add(new CCTVDto("E", "Rights5", "Studios5", "Presence5", "Media5"));
	        cctvList.add(new CCTVDto("F", "Rights6", "Studios6", "Presence6", "Media6"));
	       
	        List<CCTVDto> sortedList = cctvList.stream()
	                .sorted(Comparator.comparing(CCTVDto::getContentAndProgramming))
	                .collect(Collectors.toList());
	        System.out.println("Sorted List: " + sortedList);
	        

	        
	        List<CCTVDto> distinctList = cctvList.stream().distinct() .collect(Collectors.toList());
	        System.out.println("Distinct List: " + distinctList);
	    
	        List<CCTVDto> matchedList = cctvList.stream().filter(dto -> dto.getContentAndProgramming().equals("yourCondition"))
	                .collect(Collectors.toList());
	        System.out.println("Matched List: " + matchedList);
	        
	        List<CCTVDto> starMatchedList = cctvList.stream()
	                .filter(dto -> dto.getContentAndProgramming().equals("star"))
	                .collect(Collectors.toList());
	        System.out.println("Star Matched List: " + starMatchedList);

	        
	        List<CCTVDto> containsAMatchedList = cctvList.stream()
	                .filter(dto -> dto.getContentAndProgramming().contains("A"))
	                .collect(Collectors.toList());
	        System.out.println("Contains 'A' Matched List: " + containsAMatchedList);

	       
	        List<CCTVDto> startsWithDList = cctvList.stream()
	                .filter(dto -> dto.getContentAndProgramming().startsWith("D"))
	                .collect(Collectors.toList());
	        System.out.println("Starts with 'D' List: " + startsWithDList);
	        
	        List<CCTVDto> endsWithAList = cctvList.stream()
	                .filter(dto -> dto.getContentAndProgramming().endsWith("A"))
	                .collect(Collectors.toList());
	        System.out.println("Ends with 'A' List: " + endsWithAList);

	   
	        Optional<CCTVDto> firstDto = cctvList.stream().findFirst();
	        System.out.println("First DTO: " + firstDto);

	        
	        Optional<CCTVDto> anyDto = cctvList.stream().findAny();
	        System.out.println("Any DTO: " + anyDto);

	        
	        boolean anyMatch = cctvList.stream().anyMatch(dto -> dto.getContentAndProgramming().equals("yourCondition"));
	        System.out.println("Any Match: " + anyMatch);

	      
	        boolean allMatch = cctvList.stream().allMatch(dto -> dto.getContentAndProgramming().contains("yourCondition"));
	        System.out.println("All Match: " + allMatch);
	    
	        
	    }

}
