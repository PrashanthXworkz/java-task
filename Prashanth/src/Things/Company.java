package Things;


public class Company { 
	private Education education;
	private String companyName;
	private int salary;
	private String jobDescription;
	private int noOfEmployees;
	
	
	public Company() {
		System.out.println("No-arg invoked");
	}


	public Company(Education education, String companyName, int salary, String jobDescription, int noOfEmployees) {
		this.education = education;
		this.companyName = companyName;
		this.salary = salary;
		this.jobDescription = jobDescription;
		this.noOfEmployees = noOfEmployees;
	}


	public Education getEducation() {
		return education;
	}


	public void setEducation(Education education) {
		this.education = education;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getJobDescription() {
		return jobDescription;
	}


	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}


	public int getNoOfEmployees() {
		return noOfEmployees;
	}


	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}
	

}
