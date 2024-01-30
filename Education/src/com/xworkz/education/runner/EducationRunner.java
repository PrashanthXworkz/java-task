package com.xworkz.education.runner;

import com.xworkz.abstracts.Education;
import com.xworkz.constants.Things;
import com.xworkz.education.dto.EducationDto;
import com.xworkz.educationImplement.ReEducation;

public class EducationRunner {

	public static void main(String [] args) {
		
		Education edu=new ReEducation();
		edu.department();
		edu.schoolName();
		edu.noOfStudents();
		edu.noOfteachers();
		
		EducationDto dto=new EducationDto();
		dto.setAddress("Basavanagudi");
		dto.setEduFees(50000);
		dto.setEduTrust("Karnataka");
		dto.setNoofTrusts(60);
		dto.setThings(Things.Bags.toString());
		
		System.out.println(dto.getAddress());
		System.out.println(dto.getEduFees());
		System.out.println(dto.getNoofTrusts());
		System.out.println(dto.getEduTrust());
		System.out.println(dto.getThings());
		
		boolean save=edu.onSave(dto);
		System.out.println("save:"+save);
		
		edu.read();
		
	

	
	
	
	
	
	}
	

}
