package com.xworkz.travelling.service;

import com.xworkz.travelling.repository.Travel;

public class TravelServiceImplementation  implements TravelService{
	
	private Travel travel;
	
	public TravelServiceImplementation(Travel travel) {
		this.travel = travel;
	}
    
	
	@Override
	public boolean validateandSave(String placeName) {
		if(placeName.isEmpty() ||
				   (placeName.length()<3&& placeName.length()>25)||
				     placeName==null) {
					System.out.println("give the coorect order");
				}
				else {
					 boolean exit=isExists(placeName);
					 if(exit!=true) {
						 //invoking the save method
						 boolean save=travel.onSave(placeName);
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
	public boolean isExists(String placeName) {
		String [] name =travel.read();
		if(name!=null && placeName!=null) {
			for(String place:name) {
				if(place!=null) {
					if(name.equals(placeName)) {
						return true;
					}
				}
			}
			
		}
		return false;
	}

	
}
