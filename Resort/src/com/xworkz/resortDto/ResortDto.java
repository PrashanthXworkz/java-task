package com.xworkz.resortDto;

public class ResortDto {
	
	private String id;
	private String name;
	private String email;
	private long contactNumber;
	private String address;
	private String review;
	
	public String updatedId;
	
	public ResortDto() {
		System.out.println("no-args constructor");
	}

	public ResortDto(String id, String name, String email, long conatctNumber, String address, String review) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.contactNumber = contactNumber;
		this.address = address;
		this.review = review;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}
	
	public String toString() {
		return "Resort Details is:"+"id is:"+id+" "+"name is:"+name+" "+"email is:"+email+" "+"contact is:"+contactNumber+
				" "+"address is:"+address+" "+"review is:"+review;
	}
	
	@Override
    public boolean equals(Object obj) {
 	   if(this==obj) {
 		   return true;
 	   }
 	   if(obj==null) {
 		   return false;
 	   }
 	   if(getClass()!=obj.getClass()) {
 		   return false;
 	   }
 	   ResortDto o=(ResortDto)obj;
 	   return true;
    }
    
    @Override
    public int hashCode() {
    	return 56;
    }
	
	

}
