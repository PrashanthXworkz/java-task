package com.xworkz.abstracts;

import com.xworkz.AirportDto.AirportDto;

public abstract class Airport {
	
	public abstract void onSave(AirportDto airportdto);
	
	public abstract void read();
	
	public abstract void updateByEmail(String email,String updateMail);
	
	public abstract void searchByAddress(String correctAddress);
	
	public abstract void searchByNumber(long contactNumber);
	
	public abstract void updateById(int id,int updateId);
	
	public abstract void deleteById(int id);
	
	

}
