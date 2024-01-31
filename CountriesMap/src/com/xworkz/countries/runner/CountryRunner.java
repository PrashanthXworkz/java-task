package com.xworkz.countries.runner;

import com.xworkz.countries.repository.Country;
import com.xworkz.countries.repository.CountryImplementation;
import com.xworkz.countries.service.CountryService;
import com.xworkz.countries.service.CountryServiceImplementation;

public class CountryRunner {

	public static void main(String[] args) {
		Country country=new CountryImplementation();
//		boolean save=country.onSave("India");
//		System.out.println("country name is:"+save);
		
		
		CountryService service=new CountryServiceImplementation(country);
		service.valiadateAndSave("USA");
		service.valiadateAndSave("port");
		service.valiadateAndSave("paris");
		service.valiadateAndSave("meclin");
		service.valiadateAndSave("lulu");
		
		service .read();
		
		
		String oldName="port";
		String newName="giri";
		service.update(oldName,newName);
		service.read();
		
		service.delete("meclin");
        service.read();
	}

}
