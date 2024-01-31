package com.xworkz.product.runner;

import com.xworkz.product.abstracts.Product;
import com.xworkz.product.abstrctImplementation.ProductImplement;
import com.xworkz.product.constant.ProductCode;
import com.xworkz.product.dto.ProductDto;

public class ProductRunner {
	public static void main(String[] args) {
		Product product=new ProductImplement();
		
		ProductDto dto=new ProductDto();
		dto.setProductName("Fridge");
		dto.setDiscount(9000);
		dto.setPrice(3000);
		dto.setShopName("BigBazar");
		dto.setProductCode(ProductCode.PE01.toString());
		
		System.out.println(dto.getDiscount());
		System.out.println(dto.getPrice());
		System.out.println(dto.getProductCode());
		System.out.println(dto.getProductName());
		System.out.println(dto.getShopName());
		
		boolean save=product.onSave(dto);
		System.out.println("save:"+save);
		
		product.read();
	    
	 
	}
	
    
}
