package com.xworkz.collectionlamda.dto;


import java.time.LocalDate;
import java.util.Objects;

public class Building {// implements Comparable<Building>{
	
	private String nameofbuilding;
	private int numberofrooms;
	private LocalDate date;
	
	public Building() {
		System.out.println("no-args constructor");
	}

	public Building(String nameofbuilding, int numberofrooms,LocalDate date) {
		this.nameofbuilding = nameofbuilding;
		this.numberofrooms = numberofrooms;
		this.date=date;
	}

	public String getNameofbuilding() {
		return nameofbuilding;
	}

	public void setNameofbuilding(String nameofbuilding) {
		this.nameofbuilding = nameofbuilding;
	}

	public int getNumberofrooms() {
		return numberofrooms;
	}

	public void setNumberofrooms(int numberofrooms) {
		this.numberofrooms = numberofrooms;
	}

	@Override
	public String toString() {
		return "Building [nameofbuilding=" + nameofbuilding + ", numberofrooms=" + numberofrooms + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nameofbuilding, numberofrooms);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Building other = (Building) obj;
		return Objects.equals(nameofbuilding, other.nameofbuilding) && numberofrooms == other.numberofrooms;
	}

//	@Override
//	public int compareTo(Building o) {
//		
//		System.out.println("this is comparable method");
//		
//		int comparevalue=this.nameofbuilding.compareTo(o.nameofbuilding);
//		
//		return comparevalue;
//	}
	
	
	
	
	
	
	
	

}
