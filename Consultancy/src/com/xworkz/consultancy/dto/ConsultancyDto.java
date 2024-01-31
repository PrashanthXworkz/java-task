package com.xworkz.consultancy.dto;

import java.util.Objects;

public class ConsultancyDto {
	private String consultancyNmae;
	private int price;
	private String consultancyLocation;
	private String address;
	
	public ConsultancyDto() {
		System.out.println("no-args constructor");
	}

	public ConsultancyDto(String consultancyNmae, int price, String consultancyLocation, String address) {
		this.consultancyNmae = consultancyNmae;
		this.price = price;
		this.consultancyLocation = consultancyLocation;
		this.address = address;
	}

	public String getConsultancyNmae() {
		return consultancyNmae;
	}

	public void setConsultancyNmae(String consultancyNmae) {
		this.consultancyNmae = consultancyNmae;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getConsultancyLocation() {
		return consultancyLocation;
	}

	public void setConsultancyLocation(String consultancyLocation) {
		this.consultancyLocation = consultancyLocation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "ConsultancyDto [consultancyNmae=" + consultancyNmae + ", price=" + price + ", consultancyLocation="
				+ consultancyLocation + ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, consultancyLocation, consultancyNmae, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConsultancyDto other = (ConsultancyDto) obj;
		return Objects.equals(address, other.address) && Objects.equals(consultancyLocation, other.consultancyLocation)
				&& Objects.equals(consultancyNmae, other.consultancyNmae) && price == other.price;
	}
	

}
