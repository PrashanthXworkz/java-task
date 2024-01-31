package com.xworkz.content.repository;

import com.xworkz.content.dto.ContentDto;

public interface ContentRepository {
	
	boolean onSave(ContentDto contentdto);
	ContentDto[] read();
	boolean update(String email,ContentDto contentdto);
	

}
