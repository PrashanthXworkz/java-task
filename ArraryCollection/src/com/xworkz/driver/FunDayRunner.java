package com.xworkz.driver;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.xworkz.things.FundayDto;

public class FunDayRunner {

	public static void main(String[] args) {
		FundayDto dto=new FundayDto();
		dto.setFunDayLeader("Ajay");
		dto.setFunDayLocation("Banglore");
		dto.setFunDayMembers(60);
		dto.setFunDayName("Happy Day");
		dto.setNoOfGifts(40);
		dto.setTotalPresent(50);
		
		
		FundayDto dto1=new FundayDto();
		dto1.setFunDayLeader("Suresh");
		dto1.setFunDayLocation("Mysore");
		dto1.setFunDayMembers(70);
		dto1.setFunDayName("Happy");
		dto1.setNoOfGifts(55);
		dto1.setTotalPresent(58);
		
		FundayDto dto2=new FundayDto();
		dto2.setFunDayLeader("Arun");
		dto2.setFunDayLocation("udupi");
		dto2.setFunDayMembers(100);
		dto2.setFunDayName("Naguva");
		dto2.setNoOfGifts(63);
		dto2.setTotalPresent(80);
		
		List<FundayDto> list=new ArrayList<>();
		list.add(dto);
		list.add(dto1);
		list.add(dto2);
		
		
		ListIterator listAll=list.listIterator();
		
		
		while(listAll.hasNext()) {
			System.out.println("previous index are:"+listAll.previousIndex());
			System.out.println("reading values are:"+listAll.next());
			System.out.println(" index values  are:"+listAll.nextIndex());
			}
		
		while(listAll.hasPrevious()) {
			System.out.println("previous index are:"+listAll.previous());
		}
		
		

	}

}
