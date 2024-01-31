package com.xworkz.content.service;

import com.xworkz.content.dto.ContentDto;


public interface ContentService {
	
	boolean validateandonSave(ContentDto contentdto);
	boolean isExists(ContentDto contentdto);
	void read();
	boolean update(String email,ContentDto contentdto);


}
