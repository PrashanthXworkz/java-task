package com.xworkz.houseImplement;

import com.xworkz.abstracts.House;
import com.xworkz.house.dto.HouseDto;

public class Nilaya extends House{

	@Override
	public void startup() {
		System.out.println("house build start");
		
	}

	@Override
	public void finish() {
		System.out.println("finishing of house");
		
	}

	@Override
	public void amount() {
		System.out.println("totalamount for house");
		
	}
	

	Object[] obj= new Object[4];
	int index=0;

	@Override
	public boolean onSave(HouseDto houseDto) {
		if(houseDto!=null) {
			System.out.println("dto is null");
			if(index<obj.length) {
				obj[index]=houseDto;
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
