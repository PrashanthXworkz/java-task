package com.xworkz.house.Runner;

import com.xworkz.abstracts.Life;
import com.xworkz.constants.NativePlace;
import com.xworkz.houseImplement.Jeevan;
import com.xworkz.life.dto.LifeDto;

public class LifeRunner {
	public static void main(String [] args) {
		Life person=new Jeevan();
		person.family();
		person.familyName();
		person.gender();
		person.health();
		person.noOfPeople();
		
		
		LifeDto dto=new LifeDto();
		dto.setFamilyName("Gader");
		dto.setIncome(40000);
		dto.setNativeplace(NativePlace.Hassan.toString());
		dto.setTotalmembers(12);
		dto.setYoungsters(6);
		
		System.out.println(dto.getFamilyName());
		System.out.println(dto.getIncome());
		System.out.println(dto.getNativeplace());
		System.out.println(dto.getTotalmembers());
		System.out.println(dto.getYoungsters());
		
		
		boolean save=person.onSave(dto);
		System.out.println("save:"+save);
		
		person.read();
	}
	
	
}
