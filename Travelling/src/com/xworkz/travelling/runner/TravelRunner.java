package com.xworkz.travelling.runner;

import com.xworkz.travelling.repository.Travel;
import com.xworkz.travelling.repository.TravelRepository;
import com.xworkz.travelling.service.TravelService;
import com.xworkz.travelling.service.TravelServiceImplementation;

public class TravelRunner {
	public static void main(String [] args) {
	    Travel travel=new TravelRepository();
//	       boolean name= travel.onSave("Mangaluru");
//	    System.out.println("added save:"+name);
	    
	   TravelService service= new TravelServiceImplementation(travel);
	   service.validateandSave("Bidar");
	   service.validateandSave("Hampi");
	   service.validateandSave("Udupi");
	    
	  
	}

}
