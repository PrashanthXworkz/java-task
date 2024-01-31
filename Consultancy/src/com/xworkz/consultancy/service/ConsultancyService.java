package com.xworkz.consultancy.service;

import com.xworkz.consultancy.dto.ConsultancyDto;

public interface ConsultancyService {
	
	boolean validateandSave(ConsultancyDto consultancyDto);
	void read();

}
