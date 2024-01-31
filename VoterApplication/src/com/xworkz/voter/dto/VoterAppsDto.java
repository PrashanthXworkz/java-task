package com.xworkz.voter.dto;

import java.util.Objects;

public class VoterAppsDto {
	
	private long adharNumber;
	private String name;
	private String currentAddress;
	private int age;
	
	
	public VoterAppsDto() {
		System.out.println("no-args constructor");
		}


	public VoterAppsDto(long adharNumber, String name, String currentAddress, int age) {
		this.adharNumber = adharNumber;
		this.name = name;
		this.currentAddress = currentAddress;
		this.age = age;
	}


	@Override
	public int hashCode() {
		return Objects.hash(adharNumber, age, currentAddress, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VoterAppsDto other = (VoterAppsDto) obj;
		return adharNumber == other.adharNumber && age == other.age
				&& Objects.equals(currentAddress, other.currentAddress) && Objects.equals(name, other.name);
	}


	@Override
	public String toString() {
		return "VoterAppsDto [adharNumber=" + adharNumber + ", name=" + name + ", currentAddress=" + currentAddress
				+ ", age=" + age + "]";
	}


	public long getAdharNumber() {
		return adharNumber;
	}


	public void setAdharNumber(long adharNumber) {
		this.adharNumber = adharNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCurrentAddress() {
		return currentAddress;
	}


	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	

}
