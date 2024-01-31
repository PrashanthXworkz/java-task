package com.xworks.musical.dto;


public class MusicalDto {
	
	private String musicalName;
	private String headName;
	private int peopleAttend;
	private double costofParty;
	private String majorPeoples;
	private int varitiesFood;
	private int noofSingers;
	private String singerName;
	private String anchor;
	private int closeTime;
	
	public MusicalDto() {
		System.out.println("no-args constructor");
		}

	public MusicalDto(String musicalName, String headName, int peopleAttend, double costofParty, String majorPeoples,
			int varitiesFood, int noofSingers, String singerName, String anchor, int closeTime) {
		this.musicalName = musicalName;
		this.headName = headName;
		this.peopleAttend = peopleAttend;
		this.costofParty = costofParty;
		this.majorPeoples = majorPeoples;
		this.varitiesFood = varitiesFood;
		this.noofSingers = noofSingers;
		this.singerName = singerName;
		this.anchor = anchor;
		this.closeTime = closeTime;
	}

	public String getMusicalName() {
		return musicalName;
	}

	public void setMusicalName(String musicalName) {
		this.musicalName = musicalName;
	}

	public String getHeadName() {
		return headName;
	}

	public void setHeadName(String headName) {
		this.headName = headName;
	}

	public int getPeopleAttend() {
		return peopleAttend;
	}

	public void setPeopleAttend(int peopleAttend) {
		this.peopleAttend = peopleAttend;
	}

	public double getCostofParty() {
		return costofParty;
	}

	public void setCostofParty(double costofParty) {
		this.costofParty = costofParty;
	}

	public String getMajorPeoples() {
		return majorPeoples;
	}

	public void setMajorPeoples(String majorPeoples) {
		this.majorPeoples = majorPeoples;
	}

	public int getVaritiesFood() {
		return varitiesFood;
	}

	public void setVaritiesFood(int varitiesFood) {
		this.varitiesFood = varitiesFood;
	}

	public int getNoofSingers() {
		return noofSingers;
	}

	public void setNoofSingers(int noofSingers) {
		this.noofSingers = noofSingers;
	}

	public String getSingerName() {
		return singerName;
	}

	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}

	public String getAnchor() {
		return anchor;
	}

	public void setAnchor(String anchor) {
		this.anchor = anchor;
	}

	public int getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(int closeTime) {
		this.closeTime = closeTime;
	}
	
	
	
	@Override
	public String toString() {
		return "Musical details:"+"musicalName:"+musicalName+" "+"head is:"+headName+" "+"noOfPeople:"+peopleAttend+" "
				+"cost is:"+costofParty+" "+"major people:"+majorPeoples+" "+"varietyFood:"+varitiesFood+" "+"singers:"+noofSingers+
				" "+"singer:"+singerName+" "+"anchor:"+anchor+" "+"time close:"+closeTime;
		}
	
	@Override
    public boolean equals(Object obj) {
 	   if(this==obj) {
 		   return true;
 	   }
 	   if(obj==null) {
 		   return false;
 	   }
 	   if(getClass()!=obj.getClass()) {
 		   return false;
 	   }
 	   MusicalDto o=(MusicalDto)obj;
 	   return true;
    }
    
    @Override
    public int hashCode() {
    	return 56;
    }
    
	
	

}
