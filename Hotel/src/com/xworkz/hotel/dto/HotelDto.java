package com.xworkz.hotel.dto;

import java.util.Objects;

public class HotelDto {
	
	private String hotelName;
	private int varitiesFood;
	private String address;
	private int foodPrice;
	private String onlineService;
	
	public HotelDto() {
		System.out.println("no-args constructor");
	}

	public HotelDto(String hotelName, int varitiesFood, String address, int foodPrice, String onlineService) {
		this.hotelName = hotelName;
		this.varitiesFood = varitiesFood;
		this.address = address;
		this.foodPrice = foodPrice;
		this.onlineService = onlineService;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getVaritiesFood() {
		return varitiesFood;
	}

	public void setVaritiesFood(int varitiesFood) {
		this.varitiesFood = varitiesFood;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}

	public String getOnlineService() {
		return onlineService;
	}

	public void setOnlineService(String onlineService) {
		this.onlineService = onlineService;
	}

	@Override
	public String toString() {
		return "HotelDto [hotelName=" + hotelName + ", varitiesFood=" + varitiesFood + ", address=" + address
				+ ", foodPrice=" + foodPrice + ", onlineService=" + onlineService + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, foodPrice, hotelName, onlineService, varitiesFood);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HotelDto other = (HotelDto) obj;
		return Objects.equals(address, other.address) && foodPrice == other.foodPrice
				&& Objects.equals(hotelName, other.hotelName) && Objects.equals(onlineService, other.onlineService)
				&& varitiesFood == other.varitiesFood;
	}
	
	
	
	

}
