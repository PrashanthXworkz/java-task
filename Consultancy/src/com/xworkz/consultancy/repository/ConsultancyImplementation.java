package com.xworkz.consultancy.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.consultancy.dto.ConsultancyDto;

public class ConsultancyImplementation implements ConsultancyRepository {
	
	List<ConsultancyDto> listOfDto=new ArrayList<ConsultancyDto>();

	@Override
	public boolean onSave(ConsultancyDto consultancyDto) {
		if(listOfDto!=null) {
		    listOfDto.add(consultancyDto);
		    System.out.println("Dto is not null");
		    return true;
		    
		    }
			else {
				System.out.println("dto is null");
			}
		return false;
	}

	@Override
	public List<ConsultancyDto> readAll() {
		System.out.println("reading the values");
		return listOfDto;
	}

}
