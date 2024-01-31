package com.xworkz.resort.runner;

import com.xworkz.ResortImplement.Buffet;
import com.xworkz.abstracts.Resort;
import com.xworkz.constants.ResortId;
import com.xworkz.resortDto.ResortDto;

public class ResortRunner {
	public static void main(String [] args) {
	
	Resort resort=new Buffet();
	
	ResortDto dto = new ResortDto();
	
	dto.setAddress("jayanagar");
	dto.setContactNumber(7899186879l);
	dto.setEmail("pra@gmail.com");
	dto.setId(ResortId.R01.toString());
	dto.setReview("good");
	dto.setName("Pallavi");
	
//	System.out.println(dto.getAddress());
//	System.out.println(dto.getContactNumber());
//	System.out.println(dto.getEmail());
//	System.out.println(dto.getId());
//	System.out.println(dto.getName());
//	System.out.println(dto.getReview());
	
ResortDto dto1 = new ResortDto();
	
	dto1.setAddress("Basavanagudi");
	dto1.setContactNumber(7899178879l);
	dto1.setEmail("ram@gmail.com");
	dto1.setId(ResortId.R03.toString());
	dto1.setReview("good");
	dto1.setName("Heaven");
	
//	System.out.println(dto1.getAddress());
//	System.out.println(dto1.getContactNumber());
//	System.out.println(dto1.getEmail());
//	System.out.println(dto1.getId());
//	System.out.println(dto1.getName());
//	System.out.println(dto1.getReview());
	
ResortDto dto2 = new ResortDto();
	
	dto2.setAddress("alkola");
	dto2.setContactNumber(7899186879l);
	dto2.setEmail("cap@gmail.com");
	dto2.setId(ResortId.R04.toString());
	dto2.setReview("good");
	dto2.setName("Charaka");
	
//	System.out.println(dto2.getAddress());
//	System.out.println(dto2.getContactNumber());
//	System.out.println(dto2.getEmail());
//	System.out.println(dto2.getId());
//	System.out.println(dto2.getName());
//	System.out.println(dto2.getReview());
	
	resort.onSave(dto);
	resort.onSave(dto1);
	resort.onSave(dto2);
	
	resort.read();
	
	
	System.out.println("id is matched");
	resort.serachById(ResortId.R04.toString());
	
	
	System.out.println("name is matched");
	resort.searchByName("Heaven");
	
	System.out.println("mail-id is matched");
	resort.searchByEmail("pra@gmail.com");
	
	System.out.println("updated bu id");
	resort.updateById(ResortId.R04.toString(),ResortId.R02.toString());
	
	
	
	

}
}
