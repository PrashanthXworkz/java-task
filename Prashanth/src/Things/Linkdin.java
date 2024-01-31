package Things;

public class Linkdin {
	private Company company;
	private JobSeeker job;
	private String profilePage;
	private int networks;
	private double jobListings;
	
	
	public Linkdin() {
		System.out.println("No-arg invoked");
	}
	public Linkdin(Company company, JobSeeker job, String profilePage, int networks, double jobListings) {
		this.company = company;
		this.job = job;
		this.profilePage = profilePage;
		this.networks = networks;
		this.jobListings = jobListings;
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
	public String getProfilePage() {
		return profilePage;
	}
	public void setProfilePage(String profilePage) {
		this.profilePage = profilePage;
	}
	public int getNetworks() {
		return networks;
	}
	public void setNetworks(int networks) {
		this.networks = networks;
	}
	public double getJobListings() {
		return jobListings;
	}
	public void setJobListings(double jobListings) {
		this.jobListings = jobListings;
	}
	
	

}

