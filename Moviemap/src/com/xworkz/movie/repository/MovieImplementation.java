package com.xworkz.movie.repository;

public class MovieImplementation implements Movie {
  
	 private String [] movie=new String[5];
	 private int index=0;
	 
	@Override
	public boolean onSave(String movieName) {
		if (movie==null || index>=movie.length) {
			System.out.println("array is null");
		}
		else {
			if(index<movie.length) {
				movie[index]=movieName;
				index++;
				return true;
			}
		}

		return false;
	}

	@Override
	public String[] read() {
		return movie;
	}

	@Override
	public boolean update(String oldName, String newName) {
		for(int i=0;i<movie.length;i++) {
			if(movie!=null) {
				movie[i].equalsIgnoreCase(oldName);
				movie[i]=newName;
				return true;
			}
		}
		return false;
	}

}
