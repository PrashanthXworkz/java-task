package com.xworkz.AbstractsImplementation;

import com.xworkz.Abstracts.OwnCompany;
import com.xworkz.company.dto.CompanyDto;

public class Company extends OwnCompany {

	@Override
	public void name() {
		System.out.println("name of the company");
	}

	@Override
	public void noOfEmployess() {
		System.out.println("company employess");
		
	}

	
	Object[] obj= new Object[4];
	int index=0;
	
	
	@Override
	public boolean onSave(CompanyDto companyDto) {
		if(companyDto!=null) {
			System.out.println("dto is null");
			if(index<obj.length) {
				obj[index]=companyDto;
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
