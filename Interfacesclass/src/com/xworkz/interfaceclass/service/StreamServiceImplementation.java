package com.xworkz.interfaceclass.service;

import com.xworkz.interfaceclass.repository.StreamRepository;

public class StreamServiceImplementation implements StreamService {

	
	private StreamRepository repository;
	
	public StreamServiceImplementation(StreamRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateandSave(String streamName) {
		if(streamName.isEmpty() ||
		   (streamName.length()<3&& streamName.length()>25)||
		     streamName==null) {
			System.out.println("give the coorect order");
		}
		else {
			 boolean exit=isExists(streamName);
			 if(exit!=true) {
				 //invoking the save method
				 boolean save=repository.onSave(streamName);
				 if(save) {
					 System.out.println("added succesfully");
					 return true;
				 }
				 else {
					 System.out.println("not added Succesfully");
					 return false;
				 }
			 }
		}
		return false;
	}

	@Override
	public boolean isExists(String streamName) {
		String [] stream=repository.read();
		if(stream!=null && streamName!=null) {
			for(String name:stream) {
				if(name!=null) {
					if(name.equals(streamName)) {
						return true;
					}
				}
			}
			
		}
		return false;
	}

}
