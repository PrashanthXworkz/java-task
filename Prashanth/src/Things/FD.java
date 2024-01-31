package Things;


public class FD {
	private String bankName;
	private int amount;
	private int credited;
	
	public FD() {
		System.out.println("No-arg invoked");
	}
	public FD(String bankName,int amount,int credited) {
		this.bankName=bankName;
		this.amount=amount;
		this.credited=credited;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getCredited() {
		return credited;
	}
	public void setCredited(int credited) {
		this.credited = credited;
	}
	
}

