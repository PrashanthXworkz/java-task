package Driver;
import Things.Accounts;

public class BankPoint {
	public static void main(String [] args) {
		Accounts a1=new Accounts();
		a1.setAccountName("pushpa");
		a1.setCreditedAmount(800);
		a1.setDebited(false);
		a1.setEmployees(20);
		System.out.println(a1.getAccountName());
		System.out.println(a1.getCreditedAmount());
		System.out.println(a1.getEmployees());
		System.out.println(a1.isDebited());
	}

}
