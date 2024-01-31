package Things;


public class Payment{
	
	private Online online;
	
	
	private String typeOfMode;
	private  int balance;
	private boolean transaction;
	
	public Payment() {
		System.out.println("No-arg invoked");
	}
	public Payment(String typeOfMode,int balance,boolean transaction,Online online) {
		this.typeOfMode=typeOfMode;
		this.balance=balance;
		this.transaction=transaction;
	}
	public Online getOnline() {
		return online;
	}
	public void setOnline(Online online) {
		this.online = online;
	}
	public String getTypeOfMode() {
		return typeOfMode;
	}
	public void setTypeOfMode(String typeOfMode) {
		this.typeOfMode = typeOfMode;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public boolean isTransaction() {
		return transaction;
	}
	public void setTransaction(boolean transaction) {
		this.transaction = transaction;
	}

}

