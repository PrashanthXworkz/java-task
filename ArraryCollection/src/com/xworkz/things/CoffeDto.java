package com.xworkz.things;

import java.util.Objects;

public class CoffeDto {
	
	private String brandName;
	private String shopNmae;
	private int price;
	private String location;
	private boolean filterCoffe;
	
	public CoffeDto() {
		System.out.println("no-args constructor");
		}

	public CoffeDto(String brandName, String shopNmae, int price, String location, boolean filterCoffe) {
		this.brandName = brandName;
		this.shopNmae = shopNmae;
		this.price = price;
		this.location = location;
		this.filterCoffe = filterCoffe;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brandName, filterCoffe, location, price, shopNmae);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CoffeDto other = (CoffeDto) obj;
		return Objects.equals(brandName, other.brandName) && filterCoffe == other.filterCoffe
				&& Objects.equals(location, other.location) && price == other.price
				&& Objects.equals(shopNmae, other.shopNmae);
	}

	@Override
	public String toString() {
		return "CoffeDto [brandName=" + brandName + ", shopNmae=" + shopNmae + ", price=" + price + ", location="
				+ location + ", filterCoffe=" + filterCoffe + "]";
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getShopNmae() {
		return shopNmae;
	}

	public void setShopNmae(String shopNmae) {
		this.shopNmae = shopNmae;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isFilterCoffe() {
		return filterCoffe;
	}

	public void setFilterCoffe(boolean filterCoffe) {
		this.filterCoffe = filterCoffe;
	}
	
	

}
