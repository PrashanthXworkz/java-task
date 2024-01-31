package com.xworkz.software.repository;

public interface SoftwareRepository {
	
	boolean onSave(String softwareName);
	String[] read();
	boolean update(String oldName, String newName);
	boolean delete(String softwareName);

}
