package com.xworkz.education.dto;

public class EducationDto {
	
	
	private String eduTrust;
	private String address;
	private int noofTrusts;
	private double eduFees;
	private String things;
	
	public EducationDto() {
		System.out.println("no-arg constructor");
	}

	public EducationDto(String eduTrust, String address, int noofTrusts, double eduFees, String things) {
		this.eduTrust = eduTrust;
		this.address = address;
		this.noofTrusts = noofTrusts;
		this.eduFees = eduFees;
		this.things = things;
	}

	public String getEduTrust() {
		return eduTrust;
	}

	public void setEduTrust(String eduTrust) {
		this.eduTrust = eduTrust;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNoofTrusts() {
		return noofTrusts;
	}

	public void setNoofTrusts(int noofTrusts) {
		this.noofTrusts = noofTrusts;
	}

	public double getEduFees() {
		return eduFees;
	}

	public void setEduFees(double eduFees) {
		this.eduFees = eduFees;
	}

	public String getThings() {
		return things;
	}

	public void setThings(String things) {
		this.things = things;
	}
	
	@Override
	public String toString() {
		return "Education Details:"+"Trust is:"+eduTrust+" "+"address is:"+address+" "+"total Trust:"+noofTrusts+" "
	            +"Fees is:"+eduFees+" "+"Things is:"+things;
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
 	   EducationDto o=(EducationDto)obj;
 	   return true;
    }
    
    @Override
    public int hashCode() {
    	return 56;
    }
	
	
	
}
