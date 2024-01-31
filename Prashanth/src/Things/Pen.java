package Things;

import java.util.Objects;

public class Pen {

	public String brand;
	public String color;
	private int price;
	private String shape;
	
	public int hashCode() {
		char x='p';
		return x;
	}
	
	public String toString() {
		return "the values of pen:" +brand+ " "+color+ " "+price+ " "+shape;
	}
	
	public boolean equals(Object obj) {
      if (this == obj) {
          return true;
      }
   
      if (obj == null || getClass() != obj.getClass()) {
          return false;
      }
    
      Pen other = (Pen) obj;
      return color == other.color && Objects.equals(shape, other.shape);
		
	}

	

}
