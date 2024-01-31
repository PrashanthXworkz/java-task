package com.xworkz.collectionlamda.dto;

import java.util.Objects;

public class Entertainment {
	
	private String entertainmentType;
	private String director;
	private int cast;
	private int ratings;
	
	public Entertainment() {
		System.out.println("no-args constructor");
	}

	public Entertainment(String entertainmentType, String director, int cast, int ratings) {
		this.entertainmentType = entertainmentType;
		this.director = director;
		this.cast = cast;
		this.ratings = ratings;
	}

	public String getEntertainmentType() {
		return entertainmentType;
	}

	public void setEntertainmentType(String entertainmentType) {
		this.entertainmentType = entertainmentType;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getCast() {
		return cast;
	}

	public void setCast(int cast) {
		this.cast = cast;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cast, director, entertainmentType, ratings);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entertainment other = (Entertainment) obj;
		return cast == other.cast && Objects.equals(director, other.director)
				&& Objects.equals(entertainmentType, other.entertainmentType) && ratings == other.ratings;
	}

	@Override
	public String toString() {
		return "Entertainment [entertainmentType=" + entertainmentType + ", director=" + director + ", cast=" + cast
				+ ", ratings=" + ratings + "]";
	}
	
	
	

}
