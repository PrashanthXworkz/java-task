package com.xworkz.google.service;

import com.xworkz.google.dto.GoogleDto;

public interface GoogleAppsService {
	
	boolean validateandSave(GoogleDto googledto);
	void read();
	boolean isExists(GoogleDto googledto);
	boolean updated(String id,GoogleDto googledto);
	boolean delete(String id);

}
