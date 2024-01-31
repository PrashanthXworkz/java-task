package com.xworkz.fooditem.service;

import com.xworkz.fooditem.repository.FoodRepository;

public class FoodServiceImplementation  implements FoodService{
	
	private FoodRepository repository;
	
	public FoodServiceImplementation(FoodRepository repository) {
		this.repository = repository;
	}



	@Override
	public boolean validateandSave(String foodName) {
		if(foodName.isEmpty() ||
			(foodName.length()<3 && foodName.length()>20) ||
			foodName==null) {
			System.out.println("give the coorect food name");
			}
		else {
			
			 //if(exit!=true) {
				 //invoking the save method
				 boolean save=repository.onSave(foodName);
				 if(save) {
					 System.out.println("added succesfully");
					 return true;
				 }
				 else {
					 System.out.println("not added Succesfully");
					 return false;
				 }
			 }
		return false;
		}



	@Override
	public boolean isExits(String foodName) {
		// TODO Auto-generated method stub
		return false;
	}



	






	



	



	






	



	
	


}
