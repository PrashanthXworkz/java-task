package com.xworkz.MusicalImplement;

import com.xworks.musical.dto.MusicalDto;
import com.xworkz.abstracts.MusicalNight;

public class Singers extends MusicalNight{
	
	
	Object[] obj= new Object[4];
	int index=0;

	@Override
	public boolean onSave(MusicalDto musicalDto) {
		if(musicalDto!=null) {
			System.out.println("dto is null");
			if(index<obj.length) {
				obj[index]=musicalDto;
				index++;
			}
		}
		else {
			System.out.println("dto is not null");
		}
		return false;
	}

	@Override
	public void read() {
		for(Object object:obj) {
			System.out.println("product obj is:"+object);
		       }
		
	}

}
