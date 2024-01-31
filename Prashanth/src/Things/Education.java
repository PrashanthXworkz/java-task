package Things;


public class Education {
	
	private String eduTrust;
	private int code;
	private  int employees;
	private boolean good;
	private String trustname;
	
	public Education() {
		System.out.println("N0-arg invoked");
	}

	public Education(String eduTrust, int code, int employees, boolean good, String trustname) {
		this.eduTrust = eduTrust;
		this.code = code;
		this.employees = employees;
		this.good = good;
		this.trustname = trustname;
	}

	public String getEduTrust() {
		return eduTrust;
	}

	public void setEduTrust(String eduTrust) {
		this.eduTrust = eduTrust;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getEmployees() {
		return employees;
	}

	public void setEmployees(int employees) {
		this.employees = employees;
	}

	public boolean isGood() {
		return good;
	}

	public void setGood(boolean good) {
		this.good = good;
	}

	public String getTrustname() {
		return trustname;
	}

	public void setTrustname(String trustname) {
		this.trustname = trustname;
	}
	

}

