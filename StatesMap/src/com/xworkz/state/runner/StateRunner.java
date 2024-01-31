package com.xworkz.state.runner;

import com.xworkz.state.repository.State;
import com.xworkz.state.repository.StateImplementation;
import com.xworkz.state.service.StateService;
import com.xworkz.state.service.StateSrviceImplementation;

public class StateRunner {

	public static void main(String[] args) {
		State state =new StateImplementation();
		 boolean save=state.onSave("Bihar");
		 System.out.println("state name is:"+save);
		 
		 StateService service=new StateSrviceImplementation(state);
		 service.valiadteAndsave("Karnataka");
		 service.valiadteAndsave("Tamilnadu");
		 service.valiadteAndsave("KERALA");
		 service.valiadteAndsave("UP");
		 service.valiadteAndsave("AP");
		 
		
		
		
		}

}
