package com.xworkz.pan.dto;

import java.util.Objects;

public class PanCardDto {
	
	private String userName;
	private long adharNumber;
	private String email;
	private long contactNumber;
	private String presentAddress;
	private String panNumber;
	private int password;
	
	public PanCardDto() {
		System.out.println("no-args constructor");
	}

	public PanCardDto(String userName, long adharNumber, String email, long contactNumber, String presentAddress,
			String panNumber, int password) {
		this.userName = userName;
		this.adharNumber = adharNumber;
		this.email = email;
		this.contactNumber = contactNumber;
		this.presentAddress = presentAddress;
		this.panNumber = panNumber;
		this.password = password;
	}

	@Override
	public String toString() {
		return "PanCardDto [userName=" + userName + ", adharNumber=" + adharNumber + ", email=" + email
				+ ", contactNumber=" + contactNumber + ", presentAddress=" + presentAddress + ", panNumber=" + panNumber
				+ ", password=" + password + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(adharNumber, contactNumber, email, panNumber, password, presentAddress, userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PanCardDto other = (PanCardDto) obj;
		return adharNumber == other.adharNumber && contactNumber == other.contactNumber
				&& Objects.equals(email, other.email) && Objects.equals(panNumber, other.panNumber)
				&& password == other.password && Objects.equals(presentAddress, other.presentAddress)
				&& Objects.equals(userName, other.userName);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getAdharNumber() {
		return adharNumber;
	}

	public void setAdharNumber(long adharNumber) {
		this.adharNumber = adharNumber;
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

	public String getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
	
	

}
