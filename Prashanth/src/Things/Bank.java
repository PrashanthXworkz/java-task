package Things;


public class Bank {
	
	
	private Account account;
	private Payment payment;
	
	private int noOfBranches;
	private String ifscCode;
	private int accounts;
	
	public Bank() {
		System.out.println("No-arg invoked");	
		}
	
	public Bank(int noOfBranches,String ifscCode,int accounts,Account account,Payment payment) {
		this.noOfBranches=noOfBranches;
		this.ifscCode=ifscCode;
		this.accounts=accounts;
		this.account=account;
		this.payment=payment;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public int getNoOfBranches() {
		return noOfBranches;
	}

	public void setNoOfBranches(int noOfBranches) {
		this.noOfBranches = noOfBranches;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public int getAccounts() {
		return accounts;
	}

	public void setAccounts(int accounts) {
		this.accounts = accounts;
	}
	

}

