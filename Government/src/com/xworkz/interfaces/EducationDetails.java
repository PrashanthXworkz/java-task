package com.xworkz.interfaces;

public class EducationDetails  implements Cloneable{
	
	public String schemeName;
	public int budget;
	
	
	@Override
	public Object  clone() throws CloneNotSupportedException {
		System.out.println("clone method is running");
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "schemeName:"+schemeName+ " "+"budget is:"+budget;
	}
	
	

}
