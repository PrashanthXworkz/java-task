package com.xworkz.state.repository;

public class StateImplementation implements State {

	private String [] division=new String[5];
	private int index=0;
	
	@Override
	public boolean onSave(String stateName) {
		if (division==null || index>=division.length) {
			System.out.println("array is null");
		}
		else {
			if(index<division.length) {
				division[index]=stateName;
				index++;
				return true;
			}
		}
		return false;
	}

	@Override
	public String[] read() {
		return division;
	}

}
