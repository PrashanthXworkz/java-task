package com.xworkz.malpe.dto;

import java.util.Objects;

public class MalpeDto {
	
	private int noOfBoats;
	private int noOfFishes;
	private String location;
	private String president;
	
	public MalpeDto() {
		System.out.println("no-args constructor");
		}
	public int getNoOfBoats() {
		return noOfBoats;
	}
	public void setNoOfBoats(int noOfBoats) {
		this.noOfBoats = noOfBoats;
	}
	public int getNoOfFishes() {
		return noOfFishes;
	}
	@Override
	public String toString() {
		return "MalpeDto [noOfBoats=" + noOfBoats + ", noOfFishes=" + noOfFishes + ", location=" + location
				+ ", president=" + president + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(location, noOfBoats, noOfFishes, president);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MalpeDto other = (MalpeDto) obj;
		return Objects.equals(location, other.location) && noOfBoats == other.noOfBoats
				&& noOfFishes == other.noOfFishes && Objects.equals(president, other.president);
	}
	public void setNoOfFishes(int noOfFishes) {
		this.noOfFishes = noOfFishes;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPresident() {
		return president;
	}
	public void setPresident(String president) {
		this.president = president;
	}
	public MalpeDto(int noOfBoats, int noOfFishes, String location, String president) {
		this.noOfBoats = noOfBoats;
		this.noOfFishes = noOfFishes;
		this.location = location;
		this.president = president;
	}
	
	
	
	

}
