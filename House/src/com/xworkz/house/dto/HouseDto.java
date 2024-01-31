package com.xworkz.house.dto;


public class HouseDto {
	
	
	private String houseName;
	private int noofWindows;
	private String street;
	private double buildAmount;
	private String housedesign;
	
	public HouseDto() {
		System.out.println("no-args constructor");
	}

	public HouseDto(String houseName, int noofWindows, String street, double buildAmount, String housedesign) {
		this.houseName = houseName;
		this.noofWindows = noofWindows;
		this.street = street;
		this.buildAmount = buildAmount;
		this.housedesign = housedesign;
	}

	public String getHouseName() {
		return houseName;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	public int getNoofWindows() {
		return noofWindows;
	}

	public void setNoofWindows(int noofWindows) {
		this.noofWindows = noofWindows;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public double getBuildAmount() {
		return buildAmount;
	}

	public void setBuildAmount(double buildAmount) {
		this.buildAmount = buildAmount;
	}

	public String getHousedesign() {
		return housedesign;
	}

	public void setHousedesign(String housedesign) {
		this.housedesign = housedesign;
	}

	@Override
	public String toString() {
		return "House Details:"+"name:"+houseName+" "+"windows:"+noofWindows+" "+"street:"+street+" "+
	            "amount is:"+buildAmount+" "+"design:"+housedesign;
		}
	
	
	@Override
    public boolean equals(Object obj) {
 	   if(this==obj) {
 		   return true;
 	   }
 	   if(obj==null) {
 		   return false;
 	   }
 	   if(getClass()!=obj.getClass()) {
 		   return false;
 	   }
 	   HouseDto o=(HouseDto)obj;
 	   return true;
    }
    
    @Override
    public int hashCode() {
    	return 56;
    }
    
	
	
	

}
