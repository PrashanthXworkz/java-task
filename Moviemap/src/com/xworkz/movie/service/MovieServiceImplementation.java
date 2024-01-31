package com.xworkz.movie.service;

import com.xworkz.movie.repository.Movie;

public class MovieServiceImplementation implements MovieService {

	private Movie movie;
	
	
	
	public MovieServiceImplementation(Movie movie) {
		this.movie = movie;
	}

	@Override
	public boolean validateAndonsave(String movieName) {
		if(movieName.isEmpty() ||
				   (movieName.length()<3&& movieName.length()>25)||
				     movieName==null ||
				     movieName.contains("a")) {
					System.out.println("give the coorect order");
				}
				else {
					 boolean exit=isExists(movieName);
					 if(exit!=true) {
						 //invoking the save method
						 boolean save=movie.onSave(movieName);
						 if(save) {
							 System.out.println("added succesfully");
							 return true;
						 }
						 else {
							 System.out.println("not added Succesfully");
							 return false;
						 }
					 }
				}
		return false;
	}

	@Override
	public boolean isExists(String movieName) {
		String [] movies=movie.read();
		if(movies!=null && movieName!=null) {
			for(String name:movies
					
					) {
				if(name!=null) {
					if(name.equals(movieName)) {
						return true;
					}
				}
			}
			
		}
		
		return false;
	}

	@Override
	public boolean update(String oldName, String newName) {
		System.out.println("update running");
		if(oldName!=null&&newName!=null) {
			System.out.println("null value check");
			boolean oldValuecheck=isExists(oldName);
			System.out.println("isExists:"+oldName);
			if(oldValuecheck) {
				boolean updated=movie.update(oldName,newName);
				if(updated) {
					System.out.println("updated successfully");
					return true;
				}
				else {
					System.out.println("not updated successfully");
				}
			}
		}
			else {
				System.out.println("old value doesnot exist");
			}
		
		return false;
	}

	@Override
	public void read() {
		String[] move=movie.read();
		for(String names:move) {
			System.out.println("array element is:"+names);
		}
		
	}

}
