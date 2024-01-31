package com.xworkz.countries.repository;

public interface Country {
	
	boolean onSave(String countryName);
	String [] read();
	boolean update(String oldName, String newName);
	boolean delete(String countryName);
	

}
