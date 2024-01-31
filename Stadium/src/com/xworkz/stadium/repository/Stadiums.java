package com.xworkz.stadium.repository;

public interface Stadiums {
     
	boolean onSave(String stadiumName);
	String[] read();
	boolean update(String oldName,String newName);
	boolean delete(String stadiumName);
	
}
