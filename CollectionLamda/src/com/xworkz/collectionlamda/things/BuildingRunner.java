package com.xworkz.collectionlamda.things;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.collectionlamda.dto.Building;

public class BuildingRunner {

	public static void main(String[] args) {
		
		Building building=new Building("Ashish",6,LocalDate.now());
		
		List<Building> list=new ArrayList<Building>();
		list.add(new Building("bharat",4,LocalDate.now()));
		list.add(new Building("rajesh",9,LocalDate.of(2023, 03, 10)));
		list.add(new Building("gowri",2,LocalDate.now()));
		
//		List<Integer> l=new ArrayList<Integer>();
		
//		Collections.sort(list);
		

		list.sort(Comparator.comparing(Building::getNameofbuilding).reversed());
		
		System.out.println(list);

	}

}



