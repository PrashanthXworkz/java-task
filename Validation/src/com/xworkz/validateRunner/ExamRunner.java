package com.xworkz.validateRunner;

import com.xworkz.validate.dto.ExamDto;
import com.xworkz.validation.constant.ModeOfExam;

public class ExamRunner {

	public static void main(String[] args) {
		ExamDto dto=new ExamDto();
		dto.setApplicationId("2024RS");
		dto.setContactNumber("9972381002");
		dto.setEmail("prash@gamil.com");
		dto.setModeOfExam(ModeOfExam.offline.toString());
		dto.setName("KPSC");
		dto.setPassword("password");
		
		dto.getApplicationId();
		dto.getContactNumber();
		dto.getEmail();
		dto.getModeOfExam();
		dto.getName();
		dto.getPassword();
	}

}
