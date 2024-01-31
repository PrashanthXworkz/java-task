package Things;

import java.util.Objects;

public class Remote {

	public String brand;
	public String brandType;
	public int numberOfButtons;
	public String color;
	public String wirelesstechnology;
	public String compatability;
	
	
	public int hashCode() {
		int ab=25/5+9*9;
		return ab;
		}
	
	public String toString() {
		return "The values of remote is:"+brand+ " "+brandType+" "+numberOfButtons+" "+color+" "+wirelesstechnology+" "+compatability;
	}
	
	public boolean equals(Object obj) {
		if (this == obj) {
	          return true;
	      }
	   
	      if (obj == null || getClass() != obj.getClass()) {
	          return false;
	      }
	    
	      Remote other = (Remote) obj;
	      return brand == other.brand && Objects.equals(color, other.color);
	}

}
