package com.xworkz.travelling.repository;

public class TravelRepository implements Travel {
     
	private String [] places=new String[3];
	private int index=0;
	
	@Override
	public boolean onSave(String placeName) {
		  if(placeName==null|| index>=places.length ) {
			  System.out.println("places is null");
		  }
		  else {
			  if(index<places.length) {
				  places[index]=placeName;
				  System.out.println("added successfully");
				  index++;
				  return true;
			  }
			  else {
				  System.out.println("not added successfully");
			  }
		  }
		return false;
	}

	@Override
	public String[] read() {
		return places;
	}

}
