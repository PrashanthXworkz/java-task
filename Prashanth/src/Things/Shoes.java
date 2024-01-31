package Things;

import java.util.Objects;

public class Shoes {
	public String brandName;
	public int rate;
	int shoeSize;
	
	
	public int hashCode(){
		char b='A';
		return b;
		}
	
	public String toString() {
		return "ShoeInformation is:" +brandName+ " "+rate+ " "+shoeSize;
		}
	
	public boolean equals(Object obj) {
		  // Check for reference equality
        if (this == obj) {
            return true;
        }
       // Check if the other object is null or of a different class
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        // Now, compare the fields for equality
        Shoes other = (Shoes) obj;
        return rate == other.rate && Objects.equals(brandName, other.brandName);
		
	}

}
