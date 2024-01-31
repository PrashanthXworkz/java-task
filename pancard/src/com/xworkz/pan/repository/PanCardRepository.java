package com.xworkz.pan.repository;

import com.xworkz.pan.dto.PanCardDto;

public interface PanCardRepository {  
	boolean onSave(PanCardDto pancarddto);
	PanCardDto[] read();
	boolean updateDto(String email,PanCardDto pancarddto);

}
