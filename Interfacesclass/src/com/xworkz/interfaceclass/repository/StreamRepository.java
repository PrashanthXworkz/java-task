package com.xworkz.interfaceclass.repository;

public interface StreamRepository {
	
	boolean onSave(String streamName);
	String [] read();

}
