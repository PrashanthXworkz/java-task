package com.xworkz.educationImplement;

import com.xworkz.abstracts.Education;
import com.xworkz.education.dto.EducationDto;

public class ReEducation extends Education {
	
	@Override
	public void schoolName() {
		System.out.println("complete name of school");
		
	}

	@Override
	public void noOfStudents() {
		System.out.println("no of students get education");
		
	}

	@Override
	public void noOfteachers() {
		
		System.out.println("no of staffs in eduation");
	}

	@Override
	public void department() {
		
		System.out.println("departments in education");
	}
	
	
	Object[] obj= new Object[4];
	int index=0;


	@Override
	public boolean onSave(EducationDto educationDto) {
		if(educationDto!=null) {
			System.out.println("dto is null");
			if(index<obj.length) {
				obj[index]=educationDto;
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
