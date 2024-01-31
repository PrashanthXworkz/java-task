package com.xworkz.product.dto;

public class ProductDto {
	private String productName;
	private float price;
	private String productCode;
	private String shopName;
	private double discount;
	
	
	public ProductDto() {
		System.out.println("no-args constructor");
	}
	
	
   public ProductDto(String productName, float price, String productCode, String shopName, double discount) {
		this.productName = productName;
		this.price = price;
		this.productCode = productCode;
		this.shopName = shopName;
		this.discount = discount;
	}
   
   
   public void setProductName(String productName) {
	   this.productName=productName;
   }
   
   public String getProductName() {
	   return productName;
   }
   
   public void setPrice(int price) {
	   this.price=price;
   }
   
   public float getPrice() {
	   return price;
   }
   
   
   public void setProductCode(String productCode) {
	   this.productCode=productCode;
   }
   
   public String getProductCode() {
	   return productCode;
   }
   
   public void setShopName(String ShopName) {
	   this.shopName=shopName;
   }
   
   public String getShopName() {
	   return shopName;
   }
   
   public void setDiscount(double discount) {
	   this.discount=discount;
   }
   
   public double getDiscount() {
	   return discount;
   }
   
   @Override
   public String toString() {
	   return "productName:"+productName+" "+"price:"+price+" "+"productCode:"+productCode+" "+"shopName:"+shopName+" "+"discount:"+discount;
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
	   ProductDto o=(ProductDto)obj;
	   return true;
   }
	
   @Override
	public int hashCode() {
		return 2;
	}

}
