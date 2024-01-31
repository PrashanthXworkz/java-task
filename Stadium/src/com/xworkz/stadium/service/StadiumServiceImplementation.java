package com.xworkz.stadium.service;

import com.xworkz.stadium.repository.Stadiums;

public class StadiumServiceImplementation implements Stadiumservice {
   
	private Stadiums stadiums;
	
	public StadiumServiceImplementation(Stadiums stadiums) {
		this.stadiums = stadiums;
	}

	@Override
	public boolean valiadteandsave(String stadiumName) {
		if(stadiumName.isEmpty() ||
				   (stadiumName.length()<3&& stadiumName.length()>25)||
				     stadiumName==null ) {
					System.out.println("give the coorect order");
				}
				else {
					 boolean exit=isExists(stadiumName);
					 if(exit!=true) {
						 //invoking the save method
						 boolean save=stadiums.onSave(stadiumName);
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
	public void read() {
		String [] stadium=stadiums.read();
		for(String names:stadium) {
			System.out.println("elements are:"+names);
		}
	}

	@Override
	public boolean isExists(String stadiumName) {
		String [] software=stadiums.read();
		if(software!=null && stadiumName!=null) {
			for(String name:software) {
				if(name!=null) {
					if(name.equals(stadiumName)) {
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
			boolean oldvaluecheck=isExists(oldName);
			System.out.println("isExits:"+oldName);
			if(oldvaluecheck) {
				boolean updated=stadiums.update(oldName,newName);
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
	public boolean delete(String stadiumName) {
		if(stadiumName!=null) {
			boolean deleted=stadiums.delete(stadiumName);
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
