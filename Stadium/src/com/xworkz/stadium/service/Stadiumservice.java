package com.xworkz.stadium.service;

public interface Stadiumservice {

	boolean valiadteandsave(String stadiumName);
	void read();
	boolean isExists(String stadiumName);
	boolean update(String oldName,String newName);
	boolean delete(String stadiumName);
}
