package com.xworkz.abstracts;

import com.xworkz.house.dto.HouseDto;

public abstract class House {
	public abstract void startup();
	public abstract void finish();
	public abstract void amount();
	
	
     public abstract boolean onSave(HouseDto houseDto);
	
	public abstract void read();
}
