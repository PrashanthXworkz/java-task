package Things;


public class Online {
	
	private String website;
	private int networks;
	private boolean connected;
	
	public Online() {
		System.out.println("No-arg invoked");	
		}
	public Online(String website,int networks,boolean connected) {
		this.website=website;
		this.networks=networks;
		this.connected=connected;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public int getNetworks() {
		return networks;
	}
	public void setNetworks(int networks) {
		this.networks = networks;
	}
	public boolean isConnected() {
		return connected;
	}
	public void setConnected(boolean connected) {
		this.connected = connected;
	}

}

