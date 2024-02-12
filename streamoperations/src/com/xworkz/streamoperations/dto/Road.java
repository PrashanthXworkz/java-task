package com.xworkz.streamoperations.dto;

import java.util.Objects;

public class Road {

        private String projectName;
		private int noOfWorkers;
		private String location;
		private boolean good;
		
		
		public Road() {
			System.out.println("no-args constructor");		
			}


		public Road(String projectName, int noOfWorkers, String location, boolean good) {
			this.projectName = projectName;
			this.noOfWorkers = noOfWorkers;
			this.location = location;
			this.good = good;
		}


		public String getProjectName() {
			return projectName;
		}


		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}


		public int getNoOfWorkers() {
			return noOfWorkers;
		}


		public void setNoOfWorkers(int noOfWorkers) {
			this.noOfWorkers = noOfWorkers;
		}


		public String getLocation() {
			return location;
		}


		public void setLocation(String location) {
			this.location = location;
		}


		public boolean isGood() {
			return good;
		}


		public void setGood(boolean good) {
			this.good = good;
		}


		@Override
		public String toString() {
			return "Road [projectName=" + projectName + ", noOfWorkers=" + noOfWorkers + ", location=" + location
					+ ", good=" + good + "]";
		}


		@Override
		public int hashCode() {
			return Objects.hash(good, location, noOfWorkers, projectName);
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Road other = (Road) obj;
			return good == other.good && Objects.equals(location, other.location) && noOfWorkers == other.noOfWorkers
					&& Objects.equals(projectName, other.projectName);
		}
		
		
		

	

}
