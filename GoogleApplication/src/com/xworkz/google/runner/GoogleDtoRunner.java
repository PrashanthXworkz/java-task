package com.xworkz.google.runner;

import com.xworkz.google.dto.GoogleDto;
import com.xworkz.google.repository.GoogleAppsRepository;
import com.xworkz.google.repository.GoogleRepositoryImplementation;
import com.xworkz.google.service.GoogleAppsService;
import com.xworkz.google.service.GoogleAppsServiceImplementation;


public class GoogleDtoRunner {
	
	public static void main(String [] args) {
	
	GoogleDto dtos=new GoogleDto();
	
     dtos.setId("G001");
     dtos.setName("OYO");
     dtos.setRate(45000);
     dtos.setVersion("1.8v");
     System.out.println(dtos.toString());
	

	GoogleAppsRepository repository=new GoogleRepositoryImplementation();
	
	repository.onSave(dtos);
	//repository.read();
	
	
	GoogleAppsService service=new GoogleAppsServiceImplementation(repository);
	service.validateandSave(dtos);
	//service.read();
	
	
	GoogleDto dtos1=new GoogleDto();
	
	dtos1.setId("G002");
    dtos1.setName("Playstore");
    dtos1.setRate(4500);
    dtos1.setVersion("6.9v");
    service.updated("G001", dtos1);
    
    service.delete("G002");
	

}
}