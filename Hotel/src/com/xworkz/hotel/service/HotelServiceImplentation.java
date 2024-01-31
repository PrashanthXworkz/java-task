package com.xworkz.hotel.service;

import com.xworkz.hotel.dto.HotelDto;
import com.xworkz.hotel.repository.HotelRepository;

  public class HotelServiceImplentation implements HotelService {
	private HotelRepository repository;
	

	public HotelServiceImplentation(HotelRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean valiadateansSave(HotelDto hotelDto) {
		if(hotelDto!=null) {
			System.out.println("Dto is not null");
			if(repository.onSave(hotelDto)) {
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
