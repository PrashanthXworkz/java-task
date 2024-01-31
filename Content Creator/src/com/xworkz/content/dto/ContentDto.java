package com.xworkz.content.dto;

import java.util.Objects;

public class ContentDto {
	
	private String userName;
	private String password;
	private String email;
	private String websitePages;
	private String contentlength;
	private String accountPaid;
	
	
	public ContentDto() {
		System.out.println("no-args constructor");
	}

	public ContentDto(String userName, String password, String email, String websitePages, String contentlength,
			String accountPaid) {
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.websitePages = websitePages;
		this.contentlength = contentlength;
		this.accountPaid = accountPaid;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountPaid, contentlength, email, password, userName, websitePages);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContentDto other = (ContentDto) obj;
		return Objects.equals(accountPaid, other.accountPaid) && Objects.equals(contentlength, other.contentlength)
				&& Objects.equals(email, other.email) && Objects.equals(password, other.password)
				&& Objects.equals(userName, other.userName) && Objects.equals(websitePages, other.websitePages);
	}

	@Override
	public String toString() {
		return "ContentDto [userName=" + userName + ", password=" + password + ", email=" + email + ", websitePages="
				+ websitePages + ", contentlength=" + contentlength + ", accountPaid=" + accountPaid + "]";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsitePages() {
		return websitePages;
	}

	public void setWebsitePages(String websitePages) {
		this.websitePages = websitePages;
	}

	public String getContentlength() {
		return contentlength;
	}

	public void setContentlength(String contentlength) {
		this.contentlength = contentlength;
	}

	public String getAccountPaid() {
		return accountPaid;
	}

	public void setAccountPaid(String accountPaid) {
		this.accountPaid = accountPaid;
	}
	
	
	
	

}
