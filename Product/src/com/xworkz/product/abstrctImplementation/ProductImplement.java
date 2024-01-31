package com.xworkz.product.abstrctImplementation;

import com.xworkz.product.abstracts.Product;
import com.xworkz.product.dto.ProductDto;

public class ProductImplement extends Product {
	
	Object[] obj= new Object[4];
	int index=0;


	public boolean onSave(ProductDto productDto) {
		if(productDto!=null) {
			System.out.println("dto is null");
			if(index<obj.length) {
				obj[index]=productDto;
				index++;
			}
		}
		else {
			System.out.println("dto is not null");
		}
		return false;
	}

     @Override
	public void read() {
		for(Object object:obj) {
			System.out.println("product obj is:"+object);
		
	}


	
		
	}
	
	
	

}
