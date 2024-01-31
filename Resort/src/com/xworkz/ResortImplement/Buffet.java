package com.xworkz.ResortImplement;

import com.xworkz.abstracts.Resort;
import com.xworkz.resortDto.ResortDto;

public class Buffet extends Resort{
	
	Object[] obj=new Object[3];
	int index=0;

	@Override
	public void onSave(ResortDto resortDto) {
		if(resortDto!=null) {
			System.out.println("dto is  null");
			if(index<obj.length) {
				obj[index]=resortDto;
				index++;
			}
		}
		else {
			System.out.println("dto is not null");
		}
			
  }
		
	@Override
	public void read() {
		for(Object object:obj) {
			System.out.println("resort object is:"+object);
		}
		
	}

	@Override
	public void serachById(String id) {
		for(Object object:obj) {
			if(object!=null) {
				ResortDto resortDto=(ResortDto)object;
				if(resortDto.getId().equals(id)) {
					System.out.println(resortDto);
				}
			}
		}
	}

	@Override
	public void searchByName(String name) {
		for(Object object:obj) {
			if(object!=null) {
				ResortDto resortDto=(ResortDto)object;
				if(resortDto.getName().equals(name)) {
					System.out.println(resortDto);
				}
			}
		}
  }

	@Override
	public ResortDto searchByEmail(String email) {
		for(Object object:obj) {
			if(object!=null) {
				ResortDto resortDto=(ResortDto)object;
				if(resortDto.getEmail().equals(email)) {
					System.out.println(resortDto);
				}
			}
		}
		return null;
	}

	@Override
	public void updateById(String id,String updatedId) {
		for (int i = 0; i < obj.length; i++) {
            if (obj[i] != null) {
                ResortDto resortDto = (ResortDto) obj[i];
                if (resortDto.getId().equals(id)) {
                    obj[i] = updatedId;
                    System.out.println("Resort with ID " + id + " updated successfully.");
                    return;
                }
            }
        }
        System.out.println("Resort with ID " + id + " not found.");
		
	}

	@Override
	public void deleteById(String id) {
		 for (int i = 0; i < obj.length; i++) {
	            if (obj[i] != null) {
	                ResortDto resortDto = (ResortDto) obj[i];
	                if (resortDto.getId().equals(id)) {
	                    obj[i] = null;
	                    System.out.println("Resort with ID " + id + " deleted successfully.");
	                    return;
	                }
	            }
	        }
	        System.out.println("Resort with ID " + id + " not found.");
	    }
		
	}


