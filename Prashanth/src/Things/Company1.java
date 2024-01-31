package Things;

public class Company1 {
	
	
	private String companyName;
	private int code;
	private String companyHr;
	private double salary;
	
	public Company1() {
		super();
		System.out.println("The company is established");
	}

	public Company1(String companyName, int code, String companyHr, double salary) {
		super();
		this.companyName = companyName;
		this.code = code;
		this.companyHr = companyHr;
		this.salary = salary;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getCompanyHr() {
		return companyHr;
	}

	public void setCompanyHr(String companyHr) {
		this.companyHr = companyHr;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
