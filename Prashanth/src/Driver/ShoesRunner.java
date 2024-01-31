package Driver;

import Things.Shoes;

public class ShoesRunner {

		public static void main(String[] args) {
		 Shoes shoe=new Shoes();
		 Shoes shoe1=new Shoes();
		 shoe1.rate=45;
		 System.out.println("the class is:"+shoe.getClass());
		 System.out.println("the string is:"+shoe.toString());
		 System.out.println("the shoe equals is:"+shoe.equals(shoe));
		 System.out.println("the hashcode is:"+shoe.hashCode());
		 System.out.println("the shoe equals is:"+shoe.equals(shoe1));
	}

}
