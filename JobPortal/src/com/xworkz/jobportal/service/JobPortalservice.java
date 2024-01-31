package com.xworkz.jobportal.service;

public interface JobPortalservice {
	
	boolean  validationAndSave(String portalName);
	boolean isExists(String portalName);
	boolean update(String oldName, String newName);
	void read();

}
