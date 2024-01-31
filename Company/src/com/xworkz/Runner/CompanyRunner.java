package com.xworkz.Runner;

import com.xworkz.Abstracts.OwnCompany;
import com.xworkz.AbstractsImplementation.Company;
import com.xworkz.company.dto.CompanyDto;
import com.xworkz.constants.Companyratings;

public class CompanyRunner {
	
	public static void main(String [] args) {
		OwnCompany d=new Company();
		d.name();
		d.noOfEmployess();
		
		
		CompanyDto dto=new CompanyDto();
		dto.setAddress("Rajajinagar");
		dto.setCompanyCode("EG056");
		dto.setCompanyName("Teler");
		dto.setCompanyratings(Companyratings.extradionary.toString());
		dto.setEmployees(300);
		dto.setEpackage(45000);
		
		System.out.println(dto.getAddress());
		System.out.println(dto.getCompanyCode());
		System.out.println(dto.getCompanyName());
		System.out.println(dto.getCompanyratings());
		System.out.println(dto.getEpackage());
		System.out.println(dto.getEmployees());
		
		boolean save=d.onSave(dto);
		System.out.println("save:"+save);
		
		d.read();
	}

}
