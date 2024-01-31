package com.xworkz.houseRunner;

import com.xworkz.abstracts.House;
import com.xworkz.house.constants.Street;
import com.xworkz.house.dto.HouseDto;
import com.xworkz.houseImplement.Nilaya;

public class HouseRunner {

	
	public static void main(String [] args) {
		House house=new Nilaya();
		house.amount();
		house.finish();
		house.startup();
		
		HouseDto dto=new HouseDto();
		dto.setBuildAmount(70000);
		dto.setHousedesign("Straight");
		dto.setHouseName("Pavitra");
		dto.setNoofWindows(20);
		dto.setStreet(Street.JPNagar.toString());
		
		System.out.println(dto.getBuildAmount());
		System.out.println(dto.getHousedesign());
		System.out.println(dto.getHouseName());
		System.out.println(dto.getNoofWindows());
		System.out.println(dto.getStreet());
		
		boolean save=house.onSave(dto);
		System.out.println("save:"+save);
		
		house.read();
		
}
}