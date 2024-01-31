package com.xworkz.rapido.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.rapido.dto.RapidoDto;

public class RapidoImplementration implements RapidoRepository {
	
	List<RapidoDto> listOfDto=new ArrayList<RapidoDto>();

	@Override
	public boolean onSave(RapidoDto rapidoDto) {
		if(listOfDto!=null) {
		    listOfDto.add(rapidoDto);
		    System.out.println("Dto is not null");
		    return true;
		    
		    }
			else {
				System.out.println("dto is null");
			}
		return false;
	}

	@Override
	public List<RapidoDto> readAll() {
		System.out.println("reading all values");
		return listOfDto;
	}

}
