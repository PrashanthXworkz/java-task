package com.xworkz.consultancy.runner;

import com.xworkz.consultancy.dto.ConsultancyDto;
import com.xworkz.consultancy.repository.ConsultancyImplementation;
import com.xworkz.consultancy.repository.ConsultancyRepository;
import com.xworkz.consultancy.service.ConsultancyService;
import com.xworkz.consultancy.service.ConsultancyServiceImplementation;

public class ConsultancyRunner {
	
	public static void main(String[] args) {
		
		ConsultancyDto dto=new ConsultancyDto();
		dto.setAddress("Basavangudi");
		dto.setConsultancyLocation("Mysore");
		dto.setConsultancyNmae("Arun");
		dto.setPrice(80);
		
		System.out.println(dto.toString());
		
		ConsultancyRepository repo= new ConsultancyImplementation();
		
		ConsultancyService service =new  ConsultancyServiceImplementation(repo);
		service.validateandSave(dto);
		service.read();
		
		
	}

}
