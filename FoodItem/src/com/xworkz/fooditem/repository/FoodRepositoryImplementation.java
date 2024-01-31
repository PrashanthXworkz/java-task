package com.xworkz.fooditem.repository;

public class FoodRepositoryImplementation implements FoodRepository {

	private String [] fooditem= new String[3];
	private int i=0;
	
	
	@Override
	public boolean onSave(String foodName) {
		if(fooditem==null || i>=fooditem.length) {
			System.out.println("array is null");
		}
		else {
			if(i<fooditem.length) {
				fooditem[i]=foodName;
				i++;
				return true;
			}
		}
		
		return false;
	}


	@Override
	public String read() {
		return null;
	}

}
