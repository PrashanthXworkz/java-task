package com.xworkz.jobportal.service;

import com.xworkz.jobportal.repository.JobPortal;

public class JobPortalServiceImplementation implements JobPortalservice {

	private JobPortal portal;
	
	public JobPortalServiceImplementation(JobPortal portal) {
	   this.portal = portal;
	}

	@Override
	public boolean validationAndSave(String portalName) {
		if(portalName.isEmpty() ||
				   (portalName.length()<3&& portalName.length()>=25)||
				     portalName==null ||
				     portalName.contains("a")) {
					System.out.println("give the coorect order");
				}
				else {
					 boolean exit=isExists(portalName);
					 if(exit!=true) {
						 //invoking the save method
						 boolean save=portal.onSave(portalName);
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
	public boolean isExists(String portalName) {
		String [] job=portal.read();
		if(job!=null && portalName!=null) {
			for(String name:job) {
				if(name!=null) {
					if(name.equalsIgnoreCase(portalName)) {
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
			boolean oldvalueCheck=isExists(oldName);
			System.out.println("isExists:"+oldName);
			if(oldvalueCheck){
				System.out.println("old value is check");
				boolean updated=portal.update(oldName,newName);
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
				System.out.println("oldName doesnot exists");
			}
		
		
		return false;
	}

	@Override
	public void read() {
		String [] portals=portal.read();
		for(String names:portals) {
			System.out.println("element is:"+names);
		}
		
		
	}

}
