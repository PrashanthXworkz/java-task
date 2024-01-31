package com.xworkz.rapido.runner;

import com.xworkz.rapido.dto.RapidoDto;
import com.xworkz.rapido.repository.RapidoImplementration;
import com.xworkz.rapido.repository.RapidoRepository;
import com.xworkz.rapido.service.RapidoService;
import com.xworkz.rapido.service.RapidoserviceImplementation;

public class RapidoRunner {

	public static void main(String[] args) {
		RapidoDto dto=new RapidoDto();
		dto.setCurrentLocation("JP nagar");
		dto.setCustomers(2);
		dto.setRapidoName("Zypp");
		dto.setRapidoPrice(90);
		System.out.println(dto.toString());
		
		RapidoRepository repository=new RapidoImplementration();
		
		RapidoService service=new  RapidoserviceImplementation(repository);
		service.validateandSave(dto);
		service.read();

	}

}
