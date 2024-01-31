package Driver;

import Things.JobPortal;
import Things.Linkdin;
import Things.Naukri;
import Things.JobSeeker;
import Things.Company;
import Things.Education;

public class JobPortalRunner {
	
	public static void main(String [] args) {
		
		JobPortal a1= new JobPortal();
		
		a1.setJobListings(40);
		a1.setProfileCreation(true);
		a1.setServices(30);
		a1.getL1();
		a1.getN1();
		System.out.println(a1.getJobListings());
		System.out.println(a1.getServices());
		System.out.println(a1.isProfileCreation());
		
		
		Linkdin b1=new Linkdin();
		b1.setProfilePage("Prashanth");
		b1.setNetworks(12);
		b1.setJobListings(50);
		a1.setL1(b1);
		System.out.println(b1.getProfilePage());
		System.out.println(b1.getNetworks());
		System.out.println(b1.getJobListings());
		
		
		Naukri c1=new Naukri();
		c1.setRole("developer");
		c1.setScore(50);
		c1.setDegree(false);
		a1.setN1(c1);
		System.out.println(c1.getRole());
		System.out.println(c1.getScore());
		System.out.println(c1.isDegree());
		
		
		JobSeeker d1=new JobSeeker();
		d1.setQualification("B.E");
		d1.setExperience(4);
		d1.setSkills("JAVA,SQL");
		d1.setLocation("shivamogga");
		d1.setJobPrefer("android developer");
		d1.setConnections(23);
		b1.setJob(d1);
		c1.setJob(d1);
		System.out.println(d1.getQualification());
		System.out.println(d1.getExperience());
		System.out.println(d1.getSkills());
		System.out.println(d1.getLocation());
		System.out.println(d1.getJobPrefer());
		System.out.println(d1.getConnections());
		
		
		Company e1=new Company();
		e1.setCompanyName("deltron");
		e1.setJobDescription(".net");
		e1.setNoOfEmployees(100);
		e1.setSalary(20);
		b1.setCompany(e1);
		c1.setCompany(e1);
		System.out.println(e1.getCompanyName());
		System.out.println(e1.getJobDescription());
		System.out.println(e1.getNoOfEmployees());
		System.out.println(e1.getSalary());
		
		
		Education f1=new Education();
		f1.setEduTrust("prerana");
		f1.setCode(90);
		f1.setTrustname("PESITM");
		f1.setGood(true);
		f1.setEmployees(60);
		d1.setEducation(f1);
		e1.setEducation(f1);
		System.out.println(e1.getEducation().getTrustname());
//		System.out.println(d1.getEducation().getTrustname());
		System.out.println(f1.getEduTrust());
		System.out.println(f1.getCode());
		//System.out.println(f1.getTrustname());
		System.out.println(f1.isGood());
		System.out.println(f1.getEmployees());
		
		
		
		
	}

}

