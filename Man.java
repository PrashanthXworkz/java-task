class Man{
private int Customerid;
private String firstName;
private String lastName;
private String middleName;
private  String email;
private long phoneNumber;
private int dob;
private String address;

public void setAddress(String address){
	this.address=address;
}
public String  getAddress(){
	return address;
}
public static void main(String args[])
{
	Man man= new Man();
	man.setAddress("Shimoga");
	System.out.println(man.address);
}
}
