package com.xworkz.AirportRunner;



import java.util.Date;

import com.xworkz.AirportDto.AirportDto;
import com.xworkz.abstracts.Airport;
import com.xworkz.airportImplementation.AirportRoad;
import com.xworkz.constants.Gender;
import com.xworkz.constants.PaymentOption;

public class AirportRunner {

	public static void main(String[] args) {
		Airport port=new AirportRoad();
		
		AirportDto dto=new AirportDto();
		Date d=new Date(2001-05-04);
		Date d2=new Date(2023-10-04);
		dto.setAge(27);
		dto.setContactNumber(9972381002l);
		dto.setCorrectAddress("Davanagere");
		dto.setDateOfBirth(d);
		dto.setEmail("prash@gmail.com");
		dto.setGender(Gender.Male.toString());
		dto.setId(001);
		dto.setOfficeLocation("Banglore");
		dto.setPaymentOption(PaymentOption.Offline.toString());
		dto.setPermanetAddress("Shivamogga");
		dto.setRegisterDate(d2);
		dto.setUserName("Vinay");
		
		
		
		AirportDto dto1=new AirportDto();
		Date d3=new Date(2002-04-10);
		Date d4=new Date(2023-10-12);
		dto1.setAge(27);
		dto1.setContactNumber(9923481002l);
		dto1.setCorrectAddress("Davanagere");
		dto1.setDateOfBirth(d3);
		dto1.setEmail("chai@gmail.com");
		dto1.setGender(Gender.Female.toString());
		dto1.setId(002);
		dto1.setOfficeLocation("Manglore");
		dto1.setPaymentOption(PaymentOption.CreditCard.toString());
		dto1.setPermanetAddress("Hassan");
		dto1.setRegisterDate(d4);
		dto1.setUserName("Chaitra");
		
		
		AirportDto dto2=new AirportDto();
		Date d5=new Date(2001-10-04);
		Date d6=new Date(2023-12-23);
		dto2.setAge(25);
		dto2.setContactNumber(7353207057l);
		dto2.setCorrectAddress("Udupi");
		dto2.setDateOfBirth(d5);
		dto2.setEmail("yatish@gmail.com");
		dto2.setGender(Gender.Male.toString());
		dto2.setId(006);
		dto2.setOfficeLocation("Belagum");
		dto2.setPaymentOption(PaymentOption.online.toString());
		dto2.setPermanetAddress("Gadag");
		dto2.setRegisterDate(d6);
		dto2.setUserName("Yatish");
		
		port.onSave(dto);
		port.onSave(dto1);
		port.onSave(dto2);
		
		port.read();
		
		port.searchByAddress("Udupi");
		port.searchByNumber(9972381002l);
		port.updateByEmail(null,"chai@gmail.com");
		port.updateById(006, 004);
		port.deleteById(002);
		
		
		
		

	}

}
