package com.xworkz.pan.runner;

import com.xworkz.pan.dto.PanCardDto;
import com.xworkz.pan.repository.PanCardRepository;
import com.xworkz.pan.repository.PancardRepositoryImplementation;
import com.xworkz.pan.service.PancardService;
import com.xworkz.pan.service.PancardServiceImplementation;

public class PancardRunner {
	public static void main(String args[]) {
		PanCardDto dto=new PanCardDto();
		dto.setAdharNumber(395223849072l);
		dto.setContactNumber(9972381002l);
		dto.setEmail("Prash@gmail.com");
		dto.setPanNumber("AF56TRUV89");
		dto.setPassword(56789);
		dto.setPresentAddress("Shimoga");
		dto.setUserName("prashanth");
		 System.out.println(dto.toString());
		
		PanCardRepository repository=new PancardRepositoryImplementation();
		repository.onSave(dto);
		repository.read();
		
		
		PancardService service=new PancardServiceImplementation(repository);
		
		service.validateandonSave(dto);
		service.read();
		PanCardDto dto1=new PanCardDto();
		service.update("Shree@gmail.com", dto1);
		dto1.setAdharNumber(395783849072l);
		dto1.setContactNumber(9975681002l);
		dto1.setPanNumber("BF56TYUV89");
		dto1.setPassword(45389);
		dto1.setPresentAddress("Bidar");
		dto1.setUserName("Shree");
		 
	}

}
