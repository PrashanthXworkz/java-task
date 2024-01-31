package com.xworkz.collectionlamda.things;

import com.xworkz.collectionlamda.dto.Laptop;

public class LaptopRunner {

	public static void main(String[] args) {           
	
//		 Laptop l=new Laptop() {
//			
//			@Override
//			public void BetterLaptop() {
//				System.out.println("hi");
//				
//			}
//		};
		
		Laptop l=()->{
			System.out.println("helooo");
		};
		
		l.BetterLaptop();
			 	
		}

	}


//annonomus class