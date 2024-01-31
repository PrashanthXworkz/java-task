package com.xworkz.MusicalRunner;

import com.xworks.musical.dto.MusicalDto;
import com.xworkz.MusicalImplement.Singers;
import com.xworkz.abstracts.MusicalNight;
import com.xworkz.constants.MajorPeoples;

public class MusicalNightRunner {
	
	public static void main(String[] args) {
		MusicalNight night=new Singers();
		
		
		MusicalDto dto=new MusicalDto();
		dto.setAnchor("Channapa");
		dto.setCloseTime(9);
		dto.setCostofParty(10000);
		dto.setHeadName("Gupta");
		dto.setMajorPeoples(MajorPeoples.gurukiran.toString());
		dto.setMusicalName("Anuraga");
		dto.setNoofSingers(15);
		dto.setPeopleAttend(1000);
		dto.setSingerName("Ragav");
		dto.setVaritiesFood(12);
		
		System.out.println(dto.getAnchor());
		System.out.println(dto.getCloseTime());
		System.out.println(dto.getCostofParty());
		System.out.println(dto.getHeadName());
		System.out.println(dto.getMajorPeoples());
		System.out.println(dto.getMusicalName());
		System.out.println(dto.getNoofSingers());
		System.out.println(dto.getPeopleAttend());
		System.out.println(dto.getVaritiesFood());
		System.out.println(dto.getSingerName());
		
		boolean save=night.onSave(dto);
		System.out.println("save:"+save);
		
		night.read();
		
	}

}
