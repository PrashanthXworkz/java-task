package com.xworkz.countries.service;

import com.xworkz.countries.repository.Country;

public class CountryServiceImplementation implements CountryService {

	private Country country;
	
	public CountryServiceImplementation(Country country) {
		this.country = country;
	}

	@Override
	public boolean valiadateAndSave(String countryName) {
		if(countryName.isEmpty() ||
				   (countryName.length()<3&& countryName.length()>25)||
				     countryName==null ||
				     countryName.contains("a")) {
					System.out.println("give the coorect order");
				}
				else {
					 boolean exit=isExists(countryName);
					 if(exit!=true) {
						 //invoking the save method
						 boolean save=country.onSave(countryName);
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
	public boolean isExists(String countryName) {
		String [] state=country.read();
		if(state!=null && countryName!=null) {
			for(String name:state) {
				if(name!=null) {
					if(name.equals(countryName)) {
						return true;
					}
				}
			}
			
		}
		return false;
	}

	@Override
	public boolean update(String oldName, String newName) {
		System.out.println("update running");
		if(oldName!=null&&newName!=null) {
			System.out.println("null value check"+oldName);
			boolean oldvaluecheck=isExists(oldName);
			System.out.println("old value check:"+oldName);
			if(oldvaluecheck) {
				boolean updated=country.update(oldName,newName);
				if(updated) {
				System.out.println("update succesfully");
				return true;
			}
			else {
				System.out.println("update not successfully");
			}
		}
	}
	else {
		System.out.println("old name doesnot exists");
		}
		return false;
	}

	@Override
	public void read() {
		String [] division =country.read();
		for(String names:division) {
			System.out.println("element is:"+names);
		}
     }

	@Override
	public boolean delete(String countryName) {
		if(countryName!=null) {
			boolean deleted=country.delete(countryName);
			if(deleted) {
				System.out.println("deleted successfully");
			}
			else {
				System.out.println("delete not successfully");
			}
		}
		else {
			System.out.println("elements is not there");
		}
		return false;
	}
}
