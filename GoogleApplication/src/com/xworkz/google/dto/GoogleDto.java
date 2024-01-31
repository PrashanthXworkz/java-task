package com.xworkz.google.dto;

import java.util.Objects;

public class GoogleDto {
	private String id;
	private String name;
	private String version;
	private int rate;
	
	public GoogleDto() {
		System.out.println("no-args constructor");
	}
	
	public GoogleDto(String id, String name, String version, int rate) {
		this.id = id;
		this.name = name;
		this.version = version;
		this.rate = rate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "GoogleDto [id=" + id + ", name=" + name + ", version=" + version + ", rate=" + rate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, rate, version);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GoogleDto other = (GoogleDto) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && rate == other.rate
				&& Objects.equals(version, other.version);
	}
	
	
	
	

}
