package com.xworkz.validate.dto;

import java.util.Objects;

public class ExamDto {
	
	private String applicationId;
	private String name;
	private String email;
	private String password;
	private String contactNumber;
	private String modeOfExam;
	
	public ExamDto() {
		System.out.println("no-args constructor");
	}

	public ExamDto(String applicationId, String name, String email, String password, String contactNumber,
			String modeOfExam) {
		this.applicationId = applicationId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.contactNumber = contactNumber;
		this.modeOfExam = modeOfExam;
	}

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getModeOfExam() {
		return modeOfExam;
	}

	public void setModeOfExam(String modeOfExam) {
		this.modeOfExam = modeOfExam;
	}

	@Override
	public String toString() {
		return "ExamDto [applicationId=" + applicationId + ", name=" + name + ", email=" + email + ", password="
				+ password + ", contactNumber=" + contactNumber + ", modeOfExam=" + modeOfExam + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(applicationId, contactNumber, email, modeOfExam, name, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExamDto other = (ExamDto) obj;
		return Objects.equals(applicationId, other.applicationId) && contactNumber == other.contactNumber
				&& Objects.equals(email, other.email) && Objects.equals(modeOfExam, other.modeOfExam)
				&& Objects.equals(name, other.name) && password == other.password;
	}
	
	
	
	

}
