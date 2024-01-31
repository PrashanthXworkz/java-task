package com.xworkz.abstracts;

import com.xworkz.resortDto.ResortDto;

public abstract class Resort {
	
	
	public abstract void onSave(ResortDto resortDto);
	
	public abstract void read();
	
	public abstract void serachById(String id);
	
	public abstract void searchByName(String name);
	
	public abstract ResortDto searchByEmail(String email);
	
	
	public abstract void updateById(String id, String updatedId);
	
	public abstract void deleteById(String id);

}
