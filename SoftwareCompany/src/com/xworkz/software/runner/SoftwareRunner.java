package com.xworkz.software.runner;

import com.xworkz.software.repository.SoftwareRepository;
import com.xworkz.software.repository.SoftwareRepositoryImplementation;
import com.xworkz.software.service.SoftwareService;
import com.xworkz.software.service.SoftwareSeviceImplementation;

public class SoftwareRunner {
	
	public static void main(String[] args)
	{
		SoftwareRepository repository=new SoftwareRepositoryImplementation();
//		  boolean save=repository.onSave("PWC");
//		  System.out.println("save done:"+save);
		
		SoftwareService service=new SoftwareSeviceImplementation(repository);
		service.validateandSave("IBM");
		service.validateandSave("Microsoft");
		service.validateandSave("Micron");
		service.validateandSave("oracle");
		service.validateandSave("Micon");
		service.read();
		
            String oldName="IBM";
            String newName="oyo";
            service.update(oldName,newName);
            service.read();
            
            service.delete("Micron");
            service.read();
	}
}
