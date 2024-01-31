package com.xworkz.Interface.runner;

import com.xworkz.interfaceclass.repository.StreamRepository;
import com.xworkz.interfaceclass.repository.StreamRepositoryImplement;
import com.xworkz.interfaceclass.service.StreamService;
import com.xworkz.interfaceclass.service.StreamServiceImplementation;

public class StreamRunner {
	public static void main(String [] args) {
		StreamRepository repository=new StreamRepositoryImplement();
		
		
		StreamService service=new StreamServiceImplementation(repository);
		service.validateandSave("Mechanical");
	}

}
