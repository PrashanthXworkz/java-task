package com.xworkz.pan.service;

import com.xworkz.pan.dto.PanCardDto;
import com.xworkz.pan.repository.PanCardRepository;

public class PancardServiceImplementation implements PancardService {
	
	private PanCardRepository repository;
	

	public PancardServiceImplementation(PanCardRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateandonSave(PanCardDto pancarddto) {
		if(pancarddto==null) {
			System.out.println("googledto is null");
		}
		if(pancarddto!=null) {
			boolean userName=validateUserName(pancarddto.getUserName());
			boolean adharNumber=validateadharNumber(pancarddto.getAdharNumber());
			boolean email=validateemail(pancarddto.getEmail());
			boolean contactNumber=validatecontactNumber(pancarddto.getContactNumber());
			boolean presentAddress=validateaddress(pancarddto.getPresentAddress());
			boolean panNumber=valiadtepanNumber(pancarddto.getPanNumber());
			boolean password=valiadtepassword(pancarddto.getPassword());
			if(userName&&adharNumber&&email&&contactNumber&&presentAddress&&panNumber&&password) {
				
				boolean exist=isExists(pancarddto);
				 if(exist==false) {
					 boolean save=this.repository.onSave(pancarddto);
					 if(save) {
						 System.out.println("dtos added successfully");
						 return true;
					 }
					 else {
						 System.out.println("dtos not added successfully");
						 return false;
					 }
				 }
				 else {
					 System.out.println("dto is already exist");
				 }
			}
		
		
		}
		return false;
	}
	
	private boolean validateUserName(String userName) {
		if(userName==null) {
			return false;
		}
		if(userName.isEmpty()) {
			return false;
		}
		if(userName.length()<2) {
			return false;
		}
		
		return true;
		
	}
	
	
	private boolean validateadharNumber(long adharNumber) {
		
		
		return true;
	}
	
	private boolean validateemail(String email) {
		if(email==null) {
			return true;
		}
		if(email.isEmpty()) {
			return false;
		}
		if(!email.contains("@")) {
			return false;
		}
		if(email.length()<3&&email.length()>30) {
			return false;
		}
		return true;
	}
	
	private boolean validatecontactNumber(long l) {
		return true;
	}
	
	private boolean validateaddress(String presentAddress) {
		if(presentAddress==null) {
			return false;
		}
		if(presentAddress.isEmpty()) {
			return false;
		}
		if(presentAddress.length()<5&&presentAddress.length()>30) {
			return false;
		}
		return true;
	}
	private boolean valiadtepanNumber(String panNumber) {
		if(panNumber==null) {
			return false;
		}
		if(panNumber.isEmpty()) {
			return false;
		}
		if(panNumber.length()<10) {
			return false;
		}
		
		return true;
		
	}
	
	private boolean valiadtepassword(int password) {
		return true;
	}

	@Override
	public boolean isExists(PanCardDto pancarddto) {
		PanCardDto[] dtos=repository.read();
		if(dtos!=null) {
			for(PanCardDto name:dtos) {
				if(name!=null) {
					if(name.getUserName().equals(pancarddto.getUserName())){
						System.out.println(" userNmae is Exist");
						return true;
						}
					if(name.getEmail().equals(pancarddto.getEmail())){
						System.out.println(" name is Exist");
						return true;
						}
					
				}
			}
			
		}
		return false;
	}

	@Override
	public void read() {
		PanCardDto[] dto=repository.read();
		for(int i=0;i<dto.length;i++){
			if(dto[i]!=null) {
			System.out.println(dto[i]);
		}
	}
		
		
	}

	@Override
	public boolean update(String email, PanCardDto pancarddto) {
		PanCardDto[] dto=repository.read();
		boolean update=repository.updateDto(email, pancarddto);
		if(update) {
			System.out.println("update Successfully");
		}
		else {
			System.out.println("update not Successfully");
			
		}
		return false;
	}

}
