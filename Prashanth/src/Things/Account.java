package Things;


public class Account {
	
	private RD rd;
	private FD fd;
	private int acnumber;
	private String acName;
	private long phoneNumber;
	
	public Account() {
		System.out.println("No-arg invoked");
	}
	public Account(int acNumber,String acName,long phoneNumber,RD rd,FD fd) {
		this.acnumber=acNumber;
		this.acName=acName;
		this.phoneNumber=phoneNumber;
		this.rd=rd;
		this.fd=fd;
	}
	public RD getRd() {
		return rd;
	}
	public void setRd(RD rd) {
		this.rd = rd;
	}
	public FD getFd() {
		return fd;
	}
	public void setFd(FD fd) {
		this.fd = fd;
	}
	public int getAcnumber() {
		return acnumber;
	}
	public void setAcnumber(int acnumber) {
		this.acnumber = acnumber;
	}
	public String getAcName() {
		return acName;
	}
	public void setAcName(String acName) {
		this.acName = acName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}

