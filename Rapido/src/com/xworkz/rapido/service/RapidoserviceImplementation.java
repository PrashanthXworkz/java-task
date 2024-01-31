package com.xworkz.rapido.service;

import com.xworkz.rapido.dto.RapidoDto;
import com.xworkz.rapido.repository.RapidoRepository;

public class RapidoserviceImplementation implements RapidoService {
	
	private RapidoRepository repository;
	

	public RapidoserviceImplementation(RapidoRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateandSave(RapidoDto rapidoDto) {
		if(rapidoDto!=null) {
			System.out.println("Dto is not null");
			if(repository.onSave(rapidoDto)) {
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
		System.out.println("Read succesfully");
		
	}

}
