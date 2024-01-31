package com.xworkz.pan.service;

import com.xworkz.pan.dto.PanCardDto;

public interface PancardService {
	
	boolean validateandonSave(PanCardDto pancarddto);
	boolean isExists(PanCardDto pancarddto);
	void read();
	boolean update(String email,PanCardDto pancarddto);

}
