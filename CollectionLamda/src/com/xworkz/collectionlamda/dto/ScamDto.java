package com.xworkz.collectionlamda.dto;

import java.util.Objects;

public class ScamDto implements Comparable {
	
	private String ScamId;
	private String ScammerName;
	private String Scamtype;
	private String location;
	
	public ScamDto() {
		System.out.println("no-args Constructor");	}

	public ScamDto(String scamId, String scammerName, String scamtype, String location) {
		ScamId = scamId;
		ScammerName = scammerName;
		Scamtype = scamtype;
		this.location = location;
	}

	public String getScamId() {
		return ScamId;
	}

	public void setScamId(String scamId) {
		ScamId = scamId;
	}

	public String getScammerName() {
		return ScammerName;
	}

	public void setScammerName(String scammerName) {
		ScammerName = scammerName;
	}

	public String getScamtype() {
		return Scamtype;
	}

	public void setScamtype(String scamtype) {
		Scamtype = scamtype;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ScamId, ScammerName, Scamtype, location);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ScamDto other = (ScamDto) obj;
		return Objects.equals(ScamId, other.ScamId) && Objects.equals(ScammerName, other.ScammerName)
				&& Objects.equals(Scamtype, other.Scamtype) && Objects.equals(location, other.location);
	}

	@Override
	public String toString() {
		return "ScamDto [ScamId=" + ScamId + ", ScammerName=" + ScammerName + ", Scamtype=" + Scamtype + ", location="
				+ location + "]";
	}

	@Override
	public int compareTo(Object o) {
		System.out.println("this is comparable method");
		
		int comparevalue=this.ScammerName.compareTo(ScammerName);
		return comparevalue;
	}
	
	
	
	
	
	

}
