package com.xworkz.validations;

import com.xworkz.validate.dto.ExamDto;

public class ExamApplication {
	
	ExamDto dto=new ExamDto();
	
	public boolean validation(ExamDto dto) {
		if(dto.getApplicationId().isEmpty()) {
			return false;
		}
		else if(dto.getApplicationId()==null) {
			return false;
		}
		else if(dto.getApplicationId().length()<10) {
			return true;
		}
		else if(dto.getApplicationId().startsWith("2024")) {
			return true;
		}
		else if(dto.getName().length()>3&& dto.getName().length()<30) {
			return true;
		}
		else if(dto.getEmail().length()>2&&dto.getName().length()<30) {
			return true;
		}
		else if(dto.getEmail().length()>2&&dto.getEmail().length()<30) {
			return true;
		}
		else if(dto.getEmail()==null) {
			return false;
		}
		else if(dto.getPassword().length()>8&&dto.getPassword().length()<16){
			return true;
		}
		else if(dto.getPassword().toUpperCase() != null){
			return false;
		}
		
		else {
			return true;
		}
		
	}
	

	

}
