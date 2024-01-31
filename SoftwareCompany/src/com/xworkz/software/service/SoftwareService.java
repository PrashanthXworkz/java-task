package com.xworkz.software.service;

public interface SoftwareService {
	  
	boolean validateandSave(String softwareName);
	boolean isExits(String softwareName);
	boolean update(String oldName, String newName);
	void read();
	boolean delete(String softwareName);
	

}
