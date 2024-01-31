package com.xworkz.movie.service;

public interface MovieService {
	  
	boolean validateAndonsave(String movieName);
	boolean isExists(String movieName);
	boolean update(String oldName, String newName);
    void read();	

}
