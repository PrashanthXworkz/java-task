package com.xworkz.government.runner;

import com.xworkz.interfaces.EducationDetails;

public class EducationDetailsRunner {

	public static void main(String[] args) throws CloneNotSupportedException{
		EducationDetails education=new EducationDetails();
		education.schemeName="free bus";
		education.budget=4000000;
		
		System.out.println("the original details:"+education);
		
		EducationDetails education1= (EducationDetails)education.clone();
//		education1.schemeName="yuva-Nidhi";
//		education1.budget=2500000;
		
		System.out.println("the copied details:"+education1);

	}

}
