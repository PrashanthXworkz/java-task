package com.xworkz.jobportal.repository;

public  class JobPortalImplementation implements JobPortal {

	 private String [] jobs=new String[5];
	 private int index=0;
	
	
	
	@Override
	public boolean onSave(String portalName) {
		if (jobs==null || index>=jobs.length) {
			System.out.println("array is null");
		}
		else {
			if(index<jobs.length) {
				jobs[index]=portalName;
				index++;
				return true;
			}
		}
		return false;
	}

	@Override
	public String[] read() {
		return jobs;
	}

	@Override
	public boolean update(String oldName,String newName) {
		for(int i=0;i<jobs.length;i++) {
			if(jobs!=null) {
				if(jobs[i].equalsIgnoreCase(oldName)) {
					jobs[i]=newName;
					return true;
					}
			}
		}
		return false;
	}

}
