package Things;


public class RD {
	private int deposit;
	private String day;
	private int amount;
	public RD() {
		System.out.println("No-arg invoked");
	}
	public RD(int deposit,String day,int amount) {
		this.deposit=deposit;
		this.day=day;
		this.amount=amount;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

}
