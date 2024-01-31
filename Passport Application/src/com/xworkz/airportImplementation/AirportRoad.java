package com.xworkz.airportImplementation;

import com.xworkz.AirportDto.AirportDto;
import com.xworkz.abstracts.Airport;

public class AirportRoad extends Airport {
	
	
	
	Object [] obj=new Object[3];
	int index=0;
	

	@Override
	public void onSave(AirportDto airportdto) {
		       if(index<obj.length) {
				obj[index]=airportdto;
				index++;
			}
		
		else {
			System.out.println("dto is not null");
		}
		
	}

	@Override
	public void read() {
		for(Object object:obj) {
			System.out.println("airport object is:"+object);
		}
		
	}

	

	@Override
	public void searchByAddress(String correctAddress) {
		for(Object object:obj) {
			if(object!=null) {
				AirportDto airportdto=(AirportDto)object;
				if(airportdto.getCorrectAddress().equals(correctAddress)) {
					System.out.println(airportdto);
				}
			}
		}
		
	}

	@Override
	public void searchByNumber(long contactNumber) {
		for(Object object:obj) {
			if(object!=null) {
				AirportDto airportdto=(AirportDto)object;
				if(airportdto.getContactNumber()==contactNumber) {
					System.out.println(airportdto);
				}
			}
		}
		
		
	}
	
	
	
	@Override
	public void updateByEmail(String email, String updateMail) {
		for (int i = 0; i < obj.length; i++) {
            if (obj[i] != null) {
                AirportDto airportdto = (AirportDto) obj[i];
                if (airportdto.getEmail().equals(updateMail)) {
                    obj[i] = updateMail;
                    System.out.println("Airport with Email " + updateMail + " updated successfully.");
                    return;
                }
            }
        }
        System.out.println("Airport with Email " + updateMail + " not found.");
		
	}

	@Override
	public void updateById(int id, int updateId) {
		for (int i = 0; i < obj.length; i++) {
            if (obj[i] != null) {
                AirportDto airportdto = (AirportDto) obj[i];
                if (airportdto.getId()==id) {
                    obj[i] = updateId;
                    System.out.println("Airport with ID " + id + " updated successfully.");
                    return;
                }
            }
        }
        System.out.println("Airport with ID " + id + " not found.");
		
	}

	@Override
	public void deleteById(int id) {
		for (int i = 0; i < obj.length; i++) {
            if (obj[i] != null) {
                AirportDto airportdto = (AirportDto) obj[i];
                if (airportdto.getId()==id) {
                    obj[i] = null;
                    System.out.println("Airport with ID " + id + " deleted successfully.");
                    return;
                }
            }
        }
        System.out.println("Airport with ID " + id + " not found.");
		
	}

}
