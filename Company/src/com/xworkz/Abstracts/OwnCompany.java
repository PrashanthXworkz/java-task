package com.xworkz.Abstracts;


import com.xworkz.company.dto.CompanyDto;

public abstract class OwnCompany {
	
	public abstract void name();
	public abstract void noOfEmployess();
	
    public abstract boolean onSave(CompanyDto companyDto);
	
	public abstract void read();
	
	

}
