package com.xworkz.fooditem.runner;

import com.xworkz.fooditem.repository.FoodRepository;
import com.xworkz.fooditem.repository.FoodRepositoryImplementation;

public class FoodRunner {
	
	public static void main(String [] args) {
	
	FoodRepository repository= new FoodRepositoryImplementation();
	  boolean food=repository.onSave("Palav");
	  System.out.println("the name of food is:"+food);
	
	
	
	
	
	
	
	}

}
