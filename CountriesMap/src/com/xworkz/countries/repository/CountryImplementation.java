package com.xworkz.countries.repository;

public class CountryImplementation implements Country {

	  private String [] place=new String[5];
	  private int index=0;
	
	@Override
	public boolean onSave(String countryName) {
		if (place==null || index>=place.length) {
			System.out.println("array is null");
		}
		else {
			if(index<place.length) {
				place[index]=countryName;
				index++;
				return true;
			}
		}

		return false;
	}

	@Override
	public String[] read() {
		return place;
	}

	@Override
	public boolean update(String oldName, String newName) {
		for(int i=0;i<place.length;i++) {
			if(place!=null) {
				if(place[i].equalsIgnoreCase(oldName)){
					place[i]=newName;
					return true;
				}
				
			}
		}
		return false;
	}

	@Override
	public boolean delete(String countryName) {
		if(countryName!=null) {
			for(int i=0;i<place.length;i++) {
				place[i].equalsIgnoreCase(countryName);
				place[i]=null;
			}
		}
		return false;
	}

}
