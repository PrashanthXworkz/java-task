package com.xworkz.interfaces;

public interface EduactionRules {
      
	
	public static void setOfRules(int noOfRules) {
		noOfRules=25;
		System.out.println("The set of rules to be followed");
		}
	
	public abstract  void  rulesFollowing();
	
	default void ruleClear() {
		System.out.println("rules must be cleared");
	}

}
