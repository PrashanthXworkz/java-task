package com.xworkz.google.repository;

import com.xworkz.google.dto.GoogleDto;

public interface GoogleAppsRepository {
	
	
	boolean onSave(GoogleDto googledto);
	
	GoogleDto[] read();
	
	boolean update(String id, GoogleDto googledto);
	
	boolean delete(String id);
	

}
