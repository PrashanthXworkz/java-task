package com.xworkz.software.repository;

public class SoftwareRepositoryImplementation implements SoftwareRepository {
   
	private String [] company=new String[5];
	private  int index=0;
	
	
	
	@Override
	public boolean onSave(String softwareName) {
		if (company==null || index>=company.length) {
			System.out.println("array is null");
		}
		else {
			if(index<company.length) {
				company[index]=softwareName;
				index++;
				return true;
			}
		}
		return false;
	}

	@Override
	public String[] read() {
		return company;
	}

	@Override
	public boolean update(String oldName, String newName) {
		for(int i=0;i<company.length;i++) {
			if(company!=null) {
				company[i].equalsIgnoreCase(oldName);
				company[i]=newName;
				return true;
				}
		}
		return false;
	}

	@Override
	public boolean delete(String softwareName) {
		if(company!=null) {
		for( int i=0;i<company.length;i++) {
			company[i].equalsIgnoreCase(softwareName);
			company[i]=null;
			return true;
		            }
		}
		return false;
	}

}
