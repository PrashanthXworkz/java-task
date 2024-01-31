package Driver;

import Things.Toy;

public class ToyRunner {

	public static void main(String [] args) {
		Toy toy=new Toy();
		Toy toy1=new Toy();
		toy1.design="simple";
		
		System.out.println("the class is: "+toy.getClass());
		System.out.println("the hashCode is:"+toy.hashCode());
		System.out.println("the String is:"+toy.toString());
		System.out.println("the class is equal:"+toy.equals(toy));
		System.out.println("the class is equal:"+toy.equals(toy1.design));
		
		
	}

}
