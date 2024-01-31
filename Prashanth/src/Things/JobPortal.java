package Things;

public class JobPortal {
	
	private Naukri n1;
	private Linkdin l1;
	private int jobListings;
	private boolean profileCreation;
	private double services;
	
	public JobPortal(Naukri n1, Linkdin l1, int jobListings, boolean profileCreation, double services) {
		this.n1 = n1;
		this.l1 = l1;
		this.jobListings = jobListings;
		this.profileCreation = profileCreation;
		this.services = services;
	}

	public JobPortal() {
		System.out.println("no-arg invoked");
	}

	public Naukri getN1() {
		return n1;
	}

	public void setN1(Naukri n1) {
		this.n1 = n1;
	}

	public Linkdin getL1() {
		return l1;
	}

	public void setL1(Linkdin l1) {
		this.l1 = l1;
	}

	public int getJobListings() {
		return jobListings;
	}

	public void setJobListings(int jobListings) {
		this.jobListings = jobListings;
	}

	public boolean isProfileCreation() {
		return profileCreation;
	}

	public void setProfileCreation(boolean profileCreation) {
		this.profileCreation = profileCreation;
	}

	public double getServices() {
		return services;
	}

	public void setServices(double services) {
		this.services = services;
	}
	
	
	

}
