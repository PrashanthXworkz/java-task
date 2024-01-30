package com.xworkz.abstracts;


import com.xworkz.education.dto.EducationDto;

public abstract class Education {
     
	 public abstract void schoolName();
     public abstract void noOfStudents();
     public abstract void noOfteachers();
     public abstract void department();
     
     public abstract boolean onSave(EducationDto educationDto);
 	
 	 public abstract void read();
}
