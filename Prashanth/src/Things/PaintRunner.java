package Things;

public class PaintRunner {
	public static void main(String [] args) {
		Brush brush=new Brush();
		brush.Color="blue";
		brush.dryingtime=5;
		brush.size=16;
		brush.texture="rough";
		System.out.println("The color of paint is:"+brush.Color);
		System.out.println("The dryingtime is:"+brush.dryingtime);
		System.out.println("Size is:"+brush.size);
		System.out.println("Texture of painting is:"+brush.texture);
	}

}
