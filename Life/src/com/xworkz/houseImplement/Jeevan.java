package com.xworkz.houseImplement;

import com.xworkz.abstracts.Life;
import com.xworkz.life.dto.LifeDto;

public class Jeevan extends Life {
	
	@Override
	public void family() {
		System.out.println("family members in family");
		
	}

	@Override
	public void familyName() {
		System.out.println("family members name");
		
	}

	@Override
	public void noOfPeople() {
		System.out.println("no of peoples in that life");
		
	}

	@Override
	public void gender() {
		System.out.println("separate family according to gender");
		
	}

	@Override
	public void health() {
		System.out.println("family mambers all are good");
		
	}

	

	Object[] obj= new Object[4];
	int index=0;
	
	@Override
	public boolean onSave(LifeDto lifeDto) {
		if(lifeDto!=null) {
			System.out.println("dto is null");
			if(index<obj.length) {
				obj[index]=lifeDto;
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
