package com.xworkz.hotel.runner;

import com.xworkz.hotel.dto.HotelDto;
import com.xworkz.hotel.repository.HotelImplementation;
import com.xworkz.hotel.repository.HotelRepository;
import com.xworkz.hotel.service.HotelService;
import com.xworkz.hotel.service.HotelServiceImplentation;

public class HotelRunner {

	public static void main(String[] args) {
		HotelDto dto=new HotelDto();
		dto.setAddress("RR Nagar");
		dto.setFoodPrice(60);
		dto.setHotelName("Sri Sai");
		dto.setOnlineService("YES");
		dto.setVaritiesFood(70);
		System.out.println(dto.toString());
		
		HotelRepository repo=new HotelImplementation();
		
		HotelService service=new HotelServiceImplentation(repo);
		service.valiadateansSave(dto);
		service.read();

	}

}
