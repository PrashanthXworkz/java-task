package com.xworkz.movie.repository;

public interface Movie {
	
	boolean onSave(String movieName);
	String [] read();
	boolean update(String oldName, String newName);

}
