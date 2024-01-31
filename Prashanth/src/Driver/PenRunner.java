package Driver;

import Things.Pen;

public class PenRunner {

	public static void main(String [] args) {
		Pen pen=new Pen();
		System.out.println("the class is" +pen.getClass());
		System.out.println("the string is:"+pen.toString());
		System.out.println("the hashcode is:"+pen.hashCode());
		System.out.println("the pen is equal:"+pen.equals(pen));
	}

}
