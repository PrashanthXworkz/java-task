package com.xworkz.movie.runner;

import com.xworkz.movie.repository.Movie;
import com.xworkz.movie.repository.MovieImplementation;
import com.xworkz.movie.service.MovieService;
import com.xworkz.movie.service.MovieServiceImplementation;

public class MovieRunner {

	public static void main(String[] args) {
		Movie movie=new MovieImplementation();
//		  boolean name=movie.onSave("veer");
//		  System.out.println("movienmae is:"+name);
		  
		  
		  MovieService service= new MovieServiceImplementation(movie);
		  service.validateAndonsave("RRR");
		  service.validateAndonsave("Died");
		  service.validateAndonsave("robo");
		  service.validateAndonsave("Guli");
		  service.validateAndonsave("Stairya");
		  service.read();
		  
		  String oldName="robo";
		  String newName="SALAR";
		  service.update(oldName,newName);
		  service.read();
		  

	}

}
