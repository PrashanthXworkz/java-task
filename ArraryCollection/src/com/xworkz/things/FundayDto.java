package com.xworkz.things;

import java.util.Objects;

public class FundayDto {
	
	private String funDayName;
	private String funDayLocation;
	private int funDayMembers;
	private int  noOfGifts;
	private String funDayLeader;
	private int  totalPresent;
	
	public FundayDto() {
		System.out.println("no-args constructor");	
		}

	public FundayDto(String funDayName, String funDayLocation, int funDayMembers, int noOfGifts, String funDayLeader,
			int totalPresent) {
		this.funDayName = funDayName;
		this.funDayLocation = funDayLocation;
		this.funDayMembers = funDayMembers;
		this.noOfGifts = noOfGifts;
		this.funDayLeader = funDayLeader;
		this.totalPresent = totalPresent;
	}

	public String getFunDayName() {
		return funDayName;
	}

	public void setFunDayName(String funDayName) {
		this.funDayName = funDayName;
	}

	public String getFunDayLocation() {
		return funDayLocation;
	}

	public void setFunDayLocation(String funDayLocation) {
		this.funDayLocation = funDayLocation;
	}

	public int getFunDayMembers() {
		return funDayMembers;
	}

	public void setFunDayMembers(int funDayMembers) {
		this.funDayMembers = funDayMembers;
	}

	public int getNoOfGifts() {
		return noOfGifts;
	}

	public void setNoOfGifts(int noOfGifts) {
		this.noOfGifts = noOfGifts;
	}

	public String getFunDayLeader() {
		return funDayLeader;
	}

	public void setFunDayLeader(String funDayLeader) {
		this.funDayLeader = funDayLeader;
	}

	public int getTotalPresent() {
		return totalPresent;
	}

	public void setTotalPresent(int totalPresent) {
		this.totalPresent = totalPresent;
	}

	@Override
	public String toString() {
		return "FundayDto [funDayName=" + funDayName + ", funDayLocation=" + funDayLocation + ", funDayMembers="
				+ funDayMembers + ", noOfGifts=" + noOfGifts + ", funDayLeader=" + funDayLeader + ", totalPresent="
				+ totalPresent + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(funDayLeader, funDayLocation, funDayMembers, funDayName, noOfGifts, totalPresent);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FundayDto other = (FundayDto) obj;
		return Objects.equals(funDayLeader, other.funDayLeader) && Objects.equals(funDayLocation, other.funDayLocation)
				&& funDayMembers == other.funDayMembers && Objects.equals(funDayName, other.funDayName)
				&& noOfGifts == other.noOfGifts && totalPresent == other.totalPresent;
	}
	
	
	
	

}
