package Things;

public class Painting {
	
	// access specifier
	 String Color;
	 String texture;
	 int dryingtime;
     int size;
	
	public Painting() {
		System.out.println("No-arg constructor");
	}
	public Painting(String color, String texture, int dryingtime, int size) {
		super();
		Color = color;
		this.texture = texture;
		this.dryingtime = dryingtime;
		this.size = size;
	}
	
	

}
