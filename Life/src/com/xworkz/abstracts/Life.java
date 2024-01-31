package com.xworkz.abstracts;

import com.xworkz.life.dto.LifeDto;

public abstract class Life {
	public abstract void family();
	public abstract void familyName();
	public abstract void noOfPeople();
	public abstract void gender();
	public abstract void health();
	
	
   public abstract boolean onSave(LifeDto lifeDto);
	
	public abstract void read();
}
