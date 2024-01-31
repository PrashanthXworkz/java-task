package com.xworkz.pan.repository;

import com.xworkz.pan.dto.PanCardDto;

public class PancardRepositoryImplementation implements PanCardRepository{
	
	private PanCardDto[] pancard=new PanCardDto[3];
  private int index=0;
	@Override
	public boolean onSave(PanCardDto pancarddto) {
		if(this.index<pancard.length) {
			pancard[index]=pancarddto;
			index++;
			return true;
		}
		return false;
	}

	@Override
	public PanCardDto[] read() {
		return pancard;
	}

	@Override
	public boolean updateDto(String email, PanCardDto pancarddto) {
	for(int i=0;i<pancard.length;i++) {
		if(pancard[i]!=null) {
			if(pancard[i].getEmail().equalsIgnoreCase(email)) {
				pancard[i]=pancarddto;
				return true;
			}
		}
	}
		return false;
	}

}
