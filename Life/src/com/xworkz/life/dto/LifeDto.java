package com.xworkz.life.dto;


public class LifeDto {
	
	private String familyName;
	private int totalmembers;
	private String nativeplace;
	private double income;
	private int youngsters;
	
	public LifeDto() {
		System.out.println("no-args constructor");
		}

	public LifeDto(String familyName, int totalmembers, String nativeplace, double income, int youngsters) {
		this.familyName = familyName;
		this.totalmembers = totalmembers;
		this.nativeplace = nativeplace;
		this.income = income;
		this.youngsters = youngsters;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public int getTotalmembers() {
		return totalmembers;
	}

	public void setTotalmembers(int totalmembers) {
		this.totalmembers = totalmembers;
	}

	public String getNativeplace() {
		return nativeplace;
	}

	public void setNativeplace(String nativeplace) {
		this.nativeplace = nativeplace;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public int getYoungsters() {
		return youngsters;
	}

	public void setYoungsters(int youngsters) {
		this.youngsters = youngsters;
	}
	
	
	@Override
	public String toString() {
		return "Life details is:"+"FamilyName:"+familyName+" "+"total Members is:"+totalmembers+" "+"place is:"+nativeplace+
				    " "+"income is:"+income+" "+"youngsters is:"+youngsters;
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
 	   LifeDto o=(LifeDto)obj;
 	   return true;
    }
    
    @Override
    public int hashCode() {
    	return 56;
    }
	

}
