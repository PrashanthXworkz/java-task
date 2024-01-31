package Things;

public class Accounts extends Bank3 {
	
	public Accounts() {
		super("Rajesh",30,true,30000);
		System.out.println("Account details are filled");
		System.out.println(super.getAccountName());
		System.out.println(super.getCreditedAmount());
		System.out.println(super.getEmployees());
		System.out.println(super.isDebited());
		System.out.println("--------------");
	}
	
	

}
