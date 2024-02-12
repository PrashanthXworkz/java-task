package com.xworkz.streamoperations.dto;

import java.util.Objects;

public class CCTVDto {
	
	    private String contentAndProgramming;
	    private String broadcastingRights;
	    private String productionStudios;
	    private String onlinePresence;
	    private String socialMedia;
	    
	    public CCTVDto() {
	    	System.out.println("no-args constructor");
	    }

		public CCTVDto(String contentAndProgramming, String broadcastingRights, String productionStudios,
				String onlinePresence, String socialMedia) {
			this.contentAndProgramming = contentAndProgramming;
			this.broadcastingRights = broadcastingRights;
			this.productionStudios = productionStudios;
			this.onlinePresence = onlinePresence;
			this.socialMedia = socialMedia;
		}

		public String getContentAndProgramming() {
			return contentAndProgramming;
		}

		public void setContentAndProgramming(String contentAndProgramming) {
			this.contentAndProgramming = contentAndProgramming;
		}

		public String getBroadcastingRights() {
			return broadcastingRights;
		}

		public void setBroadcastingRights(String broadcastingRights) {
			this.broadcastingRights = broadcastingRights;
		}

		public String getProductionStudios() {
			return productionStudios;
		}

		public void setProductionStudios(String productionStudios) {
			this.productionStudios = productionStudios;
		}

		public String getOnlinePresence() {
			return onlinePresence;
		}

		public void setOnlinePresence(String onlinePresence) {
			this.onlinePresence = onlinePresence;
		}

		public String getSocialMedia() {
			return socialMedia;
		}

		public void setSocialMedia(String socialMedia) {
			this.socialMedia = socialMedia;
		}

		@Override
		public String toString() {
			return "CCTVDto [contentAndProgramming=" + contentAndProgramming + ", broadcastingRights="
					+ broadcastingRights + ", productionStudios=" + productionStudios + ", onlinePresence="
					+ onlinePresence + ", socialMedia=" + socialMedia + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(broadcastingRights, contentAndProgramming, onlinePresence, productionStudios,
					socialMedia);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			CCTVDto other = (CCTVDto) obj;
			return Objects.equals(broadcastingRights, other.broadcastingRights)
					&& Objects.equals(contentAndProgramming, other.contentAndProgramming)
					&& Objects.equals(onlinePresence, other.onlinePresence)
					&& Objects.equals(productionStudios, other.productionStudios)
					&& Objects.equals(socialMedia, other.socialMedia);
		}
		
		
	    
	    
	    

}
