package com.xworkz.company.dto;

public class CompanyDto {
	
	
	private String companyName;
	private int employees;
	private String address;
	private String companyCode;
	private double epackage;
	private String companyratings;

	public CompanyDto() {
		System.out.println("no-arg constructor");
	}

	public CompanyDto(String companyName, int employees, String address, String companyCode, double epackage,
			String companyratings) {
		this.companyName = companyName;
		this.employees = employees;
		this.address = address;
		this.companyCode = companyCode;
		this.epackage = epackage;
		this.companyratings = companyratings;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getEmployees() {
		return employees;
	}

	public void setEmployees(int employees) {
		this.employees = employees;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public double getEpackage() {
		return epackage;
	}

	public void setEpackage(double epackage) {
		this.epackage = epackage;
	}

	public String getCompanyratings() {
		return companyratings;
	}

	public void setCompanyratings(String companyratings) {
		this.companyratings = companyratings;
	}
	
	@Override
	public String toString() {
		return "company details is:"+"Company:" +companyName +" "+"employee:" +employees+" "+
	   "address:"+address+" "+"code is:"+companyCode+" "+"epackage is:"+epackage+" "+"ratings:"+companyratings; 
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
	 	   CompanyDto o=(CompanyDto)obj;
	 	   return true;
	    }
	    
	    @Override
	    public int hashCode() {
	    	return 56;
	    }
	
	
}
