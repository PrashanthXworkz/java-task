package com.xworkz.malpe.service;

import com.xworkz.malpe.dto.MalpeDto;
import com.xworkz.malpe.repository.MalpeRepository;

public class MalpeServiceImplementation implements MalpeService {
        
	private MalpeRepository repository;
	
	
	public MalpeServiceImplementation(MalpeRepository repository) {
		this.repository = repository;
	}


	@Override
	public boolean validateandSave(MalpeDto malpeDto) {
		if(malpeDto!=null) {
			System.out.println("Dto is not null");
			if(repository.onSave(malpeDto)) {
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
		System.out.println("read succes");
		
	}

}
