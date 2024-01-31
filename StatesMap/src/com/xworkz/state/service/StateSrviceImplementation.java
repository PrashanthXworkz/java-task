package com.xworkz.state.service;

import com.xworkz.state.repository.State;

public class StateSrviceImplementation implements StateService {

	private State state;
	
	
	public StateSrviceImplementation(State state) {
		this.state = state;
	}

	@Override
	public boolean valiadteAndsave(String stateName) {
		if(stateName.isEmpty() ||
				   (stateName.length()<3&& stateName.length()>25)||
				     stateName==null ||
				     stateName.contains("a")) {
					System.out.println("give the coorect order");
				}
				else {
					 boolean exit=isExists(stateName);
					 if(exit!=true) {
						 //invoking the save method
						 boolean save=state.onSave(stateName);
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
	public boolean isExists(String stateName) {
		String [] post=state.read();
		if(post!=null && stateName!=null) {
			for(String name:post) {
				if(name!=null) {
					if(name.equals(stateName)) {
						return true;
					}
				}
			}
			
		}
		return false;
	}

}
