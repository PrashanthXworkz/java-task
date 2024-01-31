package Things;

import java.util.Objects;

public class Toy {

	public String toyName;
	public int price=90;
	public String material;
	public String design;
	public boolean safety;
	
	
	public int hashCode() {
		
		int y=62%10+3*2;
		return y;
		
	}
   
	public String toString() {
		return "The toy is:" +toyName+ " "+price+ " "+material+" "+design+ " "+safety;
	}
	
	public boolean equals(Object obj) {
		if (this == obj) {
	          return true;
	      }
	   
	      if (obj == null || getClass() != obj.getClass()) {
	          return false;
	      }
	    
	      Toy other = (Toy) obj;
	      return design == other.design && Objects.equals(safety, other.safety);
	}
}
