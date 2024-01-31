package com.xworkz.driver;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.xworkz.things.CoffeDto;

public class Coffe1Runner {

	public static void main(String[] args) {
		CoffeDto dto =new CoffeDto();
		dto.setBrandName("bru");
		dto.setFilterCoffe(false);
		dto.setLocation("Jp nagar");
		dto.setPrice(20);
		dto.setShopNmae("Coffe day");
		
		CoffeDto dto1 =new CoffeDto();
		dto1.setBrandName("levista");
		dto1.setFilterCoffe(true);
		dto1.setLocation("Jayanagar");
		dto1.setPrice(40);
		dto1.setShopNmae("Cafe day");
		
		CoffeDto dto2 =new CoffeDto();
		dto2.setBrandName("intance");
		dto2.setFilterCoffe(false);
		dto2.setLocation("vijayanagar");
		dto2.setPrice(50);
		dto2.setShopNmae("filter cafe");
		
		
		List<CoffeDto> list=new ArrayList<CoffeDto>();
		list.add(dto);
		list.add(dto1);
		list.add(dto2);
		
		
		
		ListIterator listAll=list.listIterator();
		
		while(listAll.hasNext()) {
			System.out.println("previous index are:"+listAll.previousIndex());
			System.out.println(" index values  are:"+listAll.nextIndex());
			System.out.println("reading values are:"+listAll.next());
			}
		
		while(listAll.hasPrevious()) {
			System.out.println("previous index are:"+listAll.previous());
		}
		
		list.set(1, dto2);
		list.set(1, dto1);
		System.out.println("set the Values"+list);
		
		list.remove(dto);
		System.out.println("remove the Values"+list);
		
		

	}

}