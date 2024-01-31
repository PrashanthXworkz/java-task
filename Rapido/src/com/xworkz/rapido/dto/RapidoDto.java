package com.xworkz.rapido.dto;

import java.util.Objects;

public class RapidoDto {

	private String rapidoName;
	private int rapidoPrice;
	private int customers;
	private String currentLocation;
	
	public RapidoDto() {
		System.out.println("no-args Constructor");
	}

	public RapidoDto(String rapidoName, int rapidoPrice, int customers, String currentLocation) {
		this.rapidoName = rapidoName;
		this.rapidoPrice = rapidoPrice;
		this.customers = customers;
		this.currentLocation = currentLocation;
	}

	public String getRapidoName() {
		return rapidoName;
	}

	public void setRapidoName(String rapidoName) {
		this.rapidoName = rapidoName;
	}

	public int getRapidoPrice() {
		return rapidoPrice;
	}

	public void setRapidoPrice(int rapidoPrice) {
		this.rapidoPrice = rapidoPrice;
	}

	public int getCustomers() {
		return customers;
	}

	public void setCustomers(int customers) {
		this.customers = customers;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	@Override
	public String toString() {
		return "RapidoDto [rapidoName=" + rapidoName + ", rapidoPrice=" + rapidoPrice + ", customers=" + customers
				+ ", currentLocation=" + currentLocation + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(currentLocation, customers, rapidoName, rapidoPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RapidoDto other = (RapidoDto) obj;
		return Objects.equals(currentLocation, other.currentLocation) && customers == other.customers
				&& Objects.equals(rapidoName, other.rapidoName) && rapidoPrice == other.rapidoPrice;
	}
	
	
	
	
	
}
