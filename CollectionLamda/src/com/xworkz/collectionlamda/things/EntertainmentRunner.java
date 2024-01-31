package com.xworkz.collectionlamda.things;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.xworkz.collectionlamda.dto.Entertainment;

public class EntertainmentRunner {

	public static void main(String[] args) {
		//Entertainment entertainment=new Entertainment();
		
		
		List<Entertainment > list=new ArrayList<Entertainment>();
		
		list.add(new Entertainment("TV Show","raghu",40,4));
		list.add(new Entertainment("Song show","anushrii",30,6));
		list.add(new Entertainment("bigg boss","veer",35,3));
		list.add(new Entertainment("Dance","megha",20,2));
		System.out.println(list);
		list.sort(Comparator.comparing(Entertainment::getRatings));
		System.out.println(list);
//		list.sort(Comparator.comparing(Entertainment::getEntertainmentType).reversed());
//		list.sort(Comparator.comparing(Entertainment::getDirector).reversed());
//		list.sort(Comparator.comparing(Entertainment::getCast).reversed());
		//list.sort(Comparator.comparing(Entertainment::getRatings));

		

	}

}
