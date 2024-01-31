package com.xworkz.interfaceclass.repository;

public class StreamRepositoryImplement implements StreamRepository {

	
	private String[] branch=new String[3];
	private  int index=0;
	
	
	@Override
	public boolean onSave(String streamName) {
		if (branch==null || index>=branch.length) {
			System.out.println("array is null");
		}
		else {
			if(index<branch.length) {
				branch[index]=streamName;
				index++;
				return true;
			}
		}

		return false;
	}

	@Override
	public String[] read() {
		return branch;
	}

}
