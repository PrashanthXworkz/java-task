package com.xworkz.state.repository;

public interface State {
	
	boolean onSave(String stateName);
	String [] read();

}
