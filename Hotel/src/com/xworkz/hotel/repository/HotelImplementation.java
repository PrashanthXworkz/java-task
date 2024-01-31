package com.xworkz.hotel.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.hotel.dto.HotelDto;

public class HotelImplementation implements HotelRepository {
	
	List<HotelDto> listOfDto=new ArrayList<HotelDto>();

	@Override
	public boolean onSave(HotelDto hotelDto) {
		if(listOfDto!=null) {
		    listOfDto.add(hotelDto);
		    System.out.println("Dto is not null");
		    return true;
		    
		    }
			else {
				System.out.println("dto is null");
			}
		return false;
	}

	@Override
	public List<HotelDto> readAll() {
		System.out.println("reading all values");
		return listOfDto;
	}

}
