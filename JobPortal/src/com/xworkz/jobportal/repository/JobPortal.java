package com.xworkz.jobportal.repository;

public interface JobPortal {
    
	boolean onSave(String portalName);
	String [] read();
	boolean update(String oldName, String newName);
	

}
