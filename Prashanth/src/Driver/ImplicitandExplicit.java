package Driver;

public class ImplicitandExplicit {
	
	public static void main(String [] args) {
		//implicit
		int value=897363;
		System.out.println("the value is: "+value);
		
		double rate=value;
		System.out.println("the rate is :" +rate);
		
		
		//explicit
		double runRate= 990167.8965353535;
		System.out.println("the runrate is:"+runRate);
		
		float val=(float) runRate;
		System.out.println("the val is:"+val);
	}

}
