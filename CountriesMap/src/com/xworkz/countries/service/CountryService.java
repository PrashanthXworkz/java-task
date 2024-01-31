package com.xworkz.countries.service;

public interface CountryService {
	
	boolean valiadateAndSave(String countryName);
	boolean isExists(String countryName);
	boolean update(String oldName, String newName);
	void read();
	boolean delete(String countryName);
	

}
