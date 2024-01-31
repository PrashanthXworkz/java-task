package com.xworkz.consultancy.service;

import com.xworkz.consultancy.dto.ConsultancyDto;
import com.xworkz.consultancy.repository.ConsultancyRepository;

public class ConsultancyServiceImplementation implements ConsultancyService {
	
	private ConsultancyRepository repository;
	

	public ConsultancyServiceImplementation(ConsultancyRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateandSave(ConsultancyDto consultancyDto) {
		if(consultancyDto!=null) {
			System.out.println("Dto is not null");
			if(repository.onSave(consultancyDto)) {
				System.out.println("added succesfully");
			}
			else {
				System.out.println("added not succesfully");
			}
		}
		else {
			System.out.println("dto is null");
		}
		return false;
	}

	@Override
	public void read() {
		System.out.println("read succesfully");
		
	}

}
