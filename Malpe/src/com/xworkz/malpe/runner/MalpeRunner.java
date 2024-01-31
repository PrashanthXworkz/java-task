package com.xworkz.malpe.runner;

import com.xworkz.malpe.dto.MalpeDto;
import com.xworkz.malpe.repository.MalpeRepository;
import com.xworkz.malpe.repository.MapleRepositoryImplementation;
import com.xworkz.malpe.service.MalpeService;
import com.xworkz.malpe.service.MalpeServiceImplementation;

public class MalpeRunner {

	public static void main(String[] args) {
		MalpeDto dto =new MalpeDto();
		dto.setLocation("Udupi");
		dto.setNoOfBoats(20);
		dto.setNoOfFishes(7);
		dto.setPresident("Richhard");
		System.out.println(dto.toString());
		
		MalpeRepository repository= new  MapleRepositoryImplementation();
		
		MalpeService service=new MalpeServiceImplementation(repository);
		service.validateandSave(dto);
		service.read();

	}

}
