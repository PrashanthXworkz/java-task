package com.xworkz.stadium.repository;

public class StadiumRepository implements Stadiums {

	private String [] stadium=new String[5];
	private int index=0;
	
	
	
	
	
	@Override
	public boolean onSave(String stadiumName) {
		if(stadium==null || index>=stadium.length) {
			System.out.println("array is null");
		}
		else {
			if(index<stadium.length) {
				stadium[index]=stadiumName;
				index++;
				return true;
				
			}
		}
		return false;
	}

	@Override
	public String[] read() {
		return stadium;
	}

	@Override
	public boolean update(String oldName, String newName) {
	for(int i=0;i<stadium.length;i++) {
		if(stadium!=null) {
			stadium[i].equalsIgnoreCase(oldName);
			stadium[i]=newName;
			return true;
			}
		
	}
		return false;
	}

	@Override
	public boolean delete(String stadiumName) {
		if(stadiumName!=null) {
			for( int i=0;i<stadium.length;i++) {
				stadium[i].equalsIgnoreCase(stadiumName);
				stadium[i]=null;
				return true;
			            }
			}
		return false;
	}

}
