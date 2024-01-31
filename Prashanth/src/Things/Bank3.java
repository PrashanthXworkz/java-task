package Things;

public class Bank3 {
	private String accountName;
	private int employees;
	private boolean debited;
	private double creditedAmount;
	
	public Bank3() {
		System.out.println("bank account is opened");
	}

	public Bank3(String accountName, int employees, boolean debited, int creditedAmount) {
		super();
		this.accountName = accountName;
		this.employees = employees;
		this.debited = debited;
		this.creditedAmount = creditedAmount;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getEmployees() {
		return employees;
	}

	public void setEmployees(int employees) {
		this.employees = employees;
	}

	public boolean isDebited() {
		return debited;
	}

	public void setDebited(boolean debited) {
		this.debited = debited;
	}

	public double getCreditedAmount() {
		return creditedAmount;
	}

	public void setCreditedAmount(double creditedAmount) {
		this.creditedAmount = creditedAmount;
	}
	
	
	

}
