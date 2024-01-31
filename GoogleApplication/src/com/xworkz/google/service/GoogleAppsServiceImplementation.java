package com.xworkz.google.service;

import com.xworkz.google.dto.GoogleDto;
import com.xworkz.google.repository.GoogleAppsRepository;

public class GoogleAppsServiceImplementation implements GoogleAppsService {
	
	
	private GoogleAppsRepository repository;

	public GoogleAppsServiceImplementation(GoogleAppsRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public boolean validateandSave(GoogleDto googledto) {
		
		boolean validateId=true;
		boolean validateName=true;
		boolean validateversion=true;
		boolean validateRate=true;

		if(googledto==null) {
			System.out.println("googledto is null");
		}
		else {
			if(googledto.getId().equals(null)
			   || (googledto.getId().length()<3 && googledto.getId().length()>10)
			   || !googledto.getId().startsWith("G")) {
				System.out.println("give the coorect id");
				validateId=false;
			}
			if(googledto.getName().equals(null)
			   || (googledto.getName().length()<3 && googledto.getName().length()>10)) {
				System.out.println("give the correct name");
				validateName=false;
			}
			if(googledto.getVersion().equals(null)
			   || (!googledto.getVersion().endsWith("v")) ){
				System.out.println("give the correct version");
				validateversion=false;
			}
		
		if(validateId&&validateName&&validateversion&&validateRate) {
			
			boolean exist=isExists(googledto);
			
		 if(exist==true) {
			 System.out.println("+++++++++++++");
			 boolean save=repository.onSave(googledto);
			 if(save) {
				 System.out.println("saved dtos added successfully");
				 return true;
			 }
			 else {
				 System.out.println("not saved dtos not added successfully");
				 return false;
			 }
		 }
	}
		}
		return false;
	}

	@Override
	public void read() {
		GoogleDto[] dtos=repository.read();
		for(GoogleDto dto:dtos) {
			System.out.println(dto);
		}
		
	}

	@Override
	public boolean isExists(GoogleDto googledto) {
		
		GoogleDto[] dtos=repository.read();
		if(dtos!=null) {
			for(GoogleDto name:dtos) {
				if(name!=null) {
					if(name.getId().equals(googledto.getId())){
						System.out.println(" id is Exist");
						return true;
					 }
				}
			}
			
		}
		return false;
	}

	@Override
	public boolean updated(String id, GoogleDto googledto) {
		
		boolean updated=repository.update(id, googledto);
		if(updated==true) {
			System.out.println("update Successfully");
		         }
		else {
			System.out.println("update not Successfully");
			}
		return false;
	}

	@Override
	public boolean delete(String id) {
		boolean result=repository.delete(id);
		if(result==true) {
			System.out.println("id is deleted");
		}
		else {
			System.out.println("id is not deleted");
		}
		return false;
	}
}
