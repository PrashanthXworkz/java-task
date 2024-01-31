package com.xworkz.stadium.runner;

import com.xworkz.stadium.repository.StadiumRepository;
import com.xworkz.stadium.repository.Stadiums;
import com.xworkz.stadium.service.StadiumServiceImplementation;
import com.xworkz.stadium.service.Stadiumservice;

public class StadiumRunner {
	
	public static void main(String[] args) {
		Stadiums stadium=new StadiumRepository();
		
		Stadiumservice service=new  StadiumServiceImplementation(stadium);
		service.valiadteandsave("Chinnaswamy Stadium");
		service.valiadteandsave("neharu Stadium");
		service.valiadteandsave("Bhapuji stadium");
		service.valiadteandsave("atal bihari vajapeyi stadium");
		service.valiadteandsave("mahatma Gandhi stadium");
		
		service.read();
		
		String oldName="neharu stadium";
		String newName="kempegowda football stadium";
		service.update(oldName, newName);
		
		service.read();
		
		service.delete("neharu Stadium");
		service.read();
	}

}
