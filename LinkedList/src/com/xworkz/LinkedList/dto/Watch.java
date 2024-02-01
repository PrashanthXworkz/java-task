package com.xworkz.LinkedList.dto;

import java.util.Objects;

public class Watch{

	
	private String CompanyName;
	private String Name;
	private double price;
	
	
	public Watch() {
		System.out.println("no-args constructor");
	}


	public Watch(String companyName, String name, double price) {
		super();
		CompanyName = companyName;
		Name = name;
		this.price = price;
	}


	public String getCompanyName() {
		return CompanyName;
	}


	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Watch [CompanyName=" + CompanyName + ", Name=" + Name + ", price=" + price + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(CompanyName, Name, price);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Watch other = (Watch) obj;
		return Objects.equals(CompanyName, other.CompanyName) && Objects.equals(Name, other.Name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	
	

	
	
	
	
}
