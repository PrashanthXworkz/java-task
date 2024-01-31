package com.xworkz.jobportal.runner;

import com.xworkz.jobportal.repository.JobPortal;
import com.xworkz.jobportal.repository.JobPortalImplementation;
import com.xworkz.jobportal.service.JobPortalServiceImplementation;
import com.xworkz.jobportal.service.JobPortalservice;

public class JobPortalRunner {

	public static void main(String [] args) {
		JobPortal portal=new JobPortalImplementation();
		
      JobPortalservice service=new JobPortalServiceImplementation(portal);
		service.validationAndSave("linkdin");
		service.validationAndSave("naukri");
		service.validationAndSave("Google");
		service.validationAndSave("epic");
		service.validationAndSave("join");
		
		service.read();
		
		String oldName="linkdin";
		String newName="simplilistener";
		service.update(oldName,newName);
		
		service.read();
		
	} 
}
