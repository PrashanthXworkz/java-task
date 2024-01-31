package Things;


public class JobSeeker {
	
	private Education education;
	
	private String Qualification;
	private int experience;
	private String skills;
	private String Location;
	private String jobPrefer;
	private int connections;
	
	public JobSeeker() {
		System.out.println("No-arg invoked");
	}

	public JobSeeker(Education education, String qualification, int experience, String skills, String location,
			String jobPrefer, int connections) {
		this.education = education;
		Qualification = qualification;
		this.experience = experience;
		this.skills = skills;
		Location = location;
		this.jobPrefer = jobPrefer;
		this.connections = connections;
	}

	public Education getEducation() {
		return education;
	}

	public void setEducation(Education education) {
		this.education = education;
	}

	public String getQualification() {
		return Qualification;
	}

	public void setQualification(String qualification) {
		Qualification = qualification;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getJobPrefer() {
		return jobPrefer;
	}

	public void setJobPrefer(String jobPrefer) {
		this.jobPrefer = jobPrefer;
	}

	public int getConnections() {
		return connections;
	}

	public void setConnections(int connections) {
		this.connections = connections;
	}
	

}
