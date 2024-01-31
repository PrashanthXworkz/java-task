package com.xworkz.content.service;

import com.xworkz.content.dto.ContentDto;
import com.xworkz.content.repository.ContentRepository;


public class ContentServiceImplementation implements ContentService {
	
	private ContentRepository repository;
	
	public ContentServiceImplementation(ContentRepository repository) {
		this.repository = repository;
	}


	@Override
	public boolean validateandonSave(ContentDto contentdto) {
		if(contentdto==null) {
			System.out.println("googledto is null");
		}
		if(contentdto!=null) {
			boolean userName=validateUserName(contentdto.getUserName());
			boolean email=validateemail(contentdto.getEmail());
			boolean accountpaid=validateaccountpaid(contentdto.getAccountPaid());
			boolean websitepages=validatewebsitepages(contentdto.getWebsitePages());
			boolean contentlength=valiadtecontentlength(contentdto.getContentlength());
			boolean password=validatepassword(contentdto.getPassword());
			if(userName&&websitepages&&email&&contentlength&&accountpaid&&password) {
				
				boolean exist=isExists(contentdto);
				 if(exist==false) {
					 boolean save=this.repository.onSave(contentdto);
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
			if(!email.contains("userName")) {
				return false;
			}
			return true;
		}
		
		private boolean validateaccountpaid(String accountpaid) {
			if(accountpaid==null) {
				return false;
			}
			if(accountpaid.isEmpty()) {
				return false;
			}
			int min=0;
			if(min==100) {
				return true; 
			}
			int max=0;
			if(max==1000) {
				return true;
			}
			return true;
		}
		
		private boolean validatewebsitepages(String websitepages) {
			if(websitepages==null) {
				return false;
			}
			if(websitepages.isEmpty()) {
				return false;
			}
			if(!(websitepages.length()>1)) {
				return false;
			}
			
			return true;
		}

		private boolean valiadtecontentlength(String contentlength) {
			if(contentlength==null) {
				return false;
			}
			if(contentlength.isEmpty()) {
				return false;
			}
			if(contentlength.length()<30&&contentlength.length()>100) {
				return true;
			}
			return true;
		}
		
		
		private boolean validatepassword(String password) {
			if(password==null) {
				return false;
			}
			if(password.isEmpty()) {
				return false;
			}
			if(!(password.contains("$,%,*,#"))){
				return false;
				}
			
			return true;
		}
		
		
		
		
		
		
		
		
		
	@Override
	public boolean isExists(ContentDto contentdto) {
		ContentDto[] dtos=repository.read();
		if(dtos!=null) {
			for(ContentDto name:dtos) {
				if(name!=null) {
					if(name.getUserName().equals(contentdto.getUserName())){
						System.out.println(" userNmae is Exist");
						return true;
						}
					if(name.getEmail().equals(contentdto.getEmail())){
						System.out.println(" email is Exist");
						return true;
						}
					
				}
			}
			
		}
		return false;
	}

	@Override
	public void read() {
		ContentDto[] dto=repository.read();
		for(int i=0;i<dto.length;i++){
			if(dto[i]!=null) {
			System.out.println(dto[i]);
		}
	}
		
	}

	@Override
	public boolean update(String email, ContentDto contentdto) {
		ContentDto[] dto=repository.read();
		boolean update=repository.update(email, contentdto);
		if(update) {
			System.out.println("update Successfully");
		}
		else {
			System.out.println("update not Successfully");
			
		}
		return false;
	}

	
	

}
