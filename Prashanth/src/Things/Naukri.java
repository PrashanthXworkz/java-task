package Things;


public class Naukri {
	
	private Company company;
	private JobSeeker job;
	private String role;
	private double score;
	private boolean degree;
	
	public Naukri() {
		System.out.println("No-arg invoked");
	}
	public Naukri(Company company, JobSeeker job, String role, double score, boolean degree) {
		this.company = company;
		this.job = job;
		this.role = role;
		this.score = score;
		this.degree = degree;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public JobSeeker getJob() {
		return job;
	}
	public void setJob(JobSeeker job) {
		this.job = job;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public boolean isDegree() {
		return degree;
	}
	public void setDegree(boolean degree) {
		this.degree = degree;
	}
	
	

}

