package com.xworkz.malpe.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.malpe.dto.MalpeDto;

public class MapleRepositoryImplementation implements MalpeRepository {
  
	List<MalpeDto> listOfDto= new ArrayList<MalpeDto>();
	
	@Override
	public boolean onSave(MalpeDto malpedto) {
		if(listOfDto!=null) {
	    listOfDto.add(malpedto);
	    System.out.println("Dto is not null");
	    return true;
	    
	    }
		else {
			System.out.println("dto is null");
		}
		return false;
	}

	@Override
	public List<MalpeDto> readAll() {
		System.out.println("reading");
		return listOfDto;
	}

}
