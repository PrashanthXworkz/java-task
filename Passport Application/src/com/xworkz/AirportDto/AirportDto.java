package com.xworkz.AirportDto;

import java.util.Date;

public class AirportDto {
	private int id;
	private String userName;
	private Date dateOfBirth;
	private String correctAddress;
	private String permanetAddress;
	private Date registerDate;
	private String officeLocation;
	private String gender;
	private int age;
	private String email;
	private long contactNumber;
	private String paymentOption;
	
	
	public AirportDto() {
		System.out.println("no-arg constructor");
	}


	public AirportDto(int id, String userName, Date dateOfBirth, String correctAddress, String permanetAddress,
			Date registerDate, String officeLocation, String gender, int age, String email, long contactNumber,
			String paymentOption) {
		this.id = id;
		this.userName = userName;
		this.dateOfBirth = dateOfBirth;
		this.correctAddress = correctAddress;
		this.permanetAddress = permanetAddress;
		this.registerDate = registerDate;
		this.officeLocation = officeLocation;
		this.gender = gender;
		this.age = age;
		this.email = email;
		this.contactNumber = contactNumber;
		this.paymentOption = paymentOption;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getCorrectAddress() {
		return correctAddress;
	}


	public void setCorrectAddress(String correctAddress) {
		this.correctAddress = correctAddress;
	}


	public String getPermanetAddress() {
		return permanetAddress;
	}


	public void setPermanetAddress(String permanetAddress) {
		this.permanetAddress = permanetAddress;
	}


	public Date getRegisterDate() {
		return registerDate;
	}


	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}


	public String getOfficeLocation() {
		return officeLocation;
	}


	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}


	public String getPaymentOption() {
		return paymentOption;
	}


	public void setPaymentOption(String paymentOption) {
		this.paymentOption = paymentOption;
	}
	
	@Override
	public String toString(){
		return "Airport Details:"+"id is:"+id+" "+"userName is:"+userName+" "+"Date of Birth:"+dateOfBirth+" "+"correctAddress:"+correctAddress+" "+"permanetAddress is:"
	            +permanetAddress+"registration is:"+registerDate+" "+"location is:"+officeLocation+" "+"gender is:"+gender+" "+"contactNumber is:"+contactNumber+" "+
				"age is:"+age+" "+"payment option is:"+paymentOption;
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
	 	   AirportDto o=(AirportDto)obj;
	 	   return true;
	

	
	
	}
	
	
	

}
