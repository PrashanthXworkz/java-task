package com.xworkz.software.service;

import com.xworkz.software.repository.SoftwareRepository;

public class SoftwareSeviceImplementation implements SoftwareService {
      private SoftwareRepository repository;
      
      
	public SoftwareSeviceImplementation(SoftwareRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateandSave(String softwareName) {
		if(softwareName.isEmpty() ||
				   (softwareName.length()<3&& softwareName.length()>25)||
				     softwareName==null ||
				 softwareName.contains("a")   ) {
					System.out.println("give the coorect order");
				}
				else {
					 boolean exit=isExits(softwareName);
					 if(exit!=true) {
						 //invoking the save method
						 boolean save=repository.onSave(softwareName);
						 if(save) {
							 System.out.println("added succesfully");
							 return true;
						 }
						 else {
							 System.out.println("not added Succesfully");
							 return false;
						 }
					 }
				}
		return false;
	}


	@Override
	public boolean isExits(String softwareName) {
		String [] software=repository.read();
		if(software!=null && softwareName!=null) {
			for(String name:software) {
				if(name!=null) {
					if(name.equals(softwareName)) {
						return true;
					}
				}
			}
			
		}
		return false;
		
		
		
	}

	@Override
	public boolean update(String oldName, String newName) {
		System.out.println("update running");
		if(oldName!=null&&newName!=null) {
			System.out.println("null check");
			boolean oldvaluecheck=isExits(oldName);
			System.out.println("isExits:"+oldName);
			if(oldvaluecheck) {
				boolean updated=repository.update(oldName,newName);
				if(updated) {
					System.out.println("updated successfully");
					return true;
				}
				else {
					System.out.println("not updated successfully");
				}
			}
		}
		else {
			System.out.println("old element doesnot exist");
		}
		return false;
	}

	@Override
	public void read() {
		String [] softwares=repository.read();
		for(String names:softwares) {
			System.out.println("elements are:"+names);
		}
	}

	

	@Override
	public boolean delete(String softwareName) {
		if(softwareName!=null) {
			boolean deleted=repository.delete(softwareName);
			if(deleted) {
				System.out.println("deleted successfully");
			}
			else {
				System.out.println("deleted not successfully");
			}
		}
		else {
			System.out.println("element doesnot found it");
		}
		return false;
	}
	
}
		
	
			
			
