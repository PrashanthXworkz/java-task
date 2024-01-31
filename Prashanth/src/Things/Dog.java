package Things;

public class Dog extends Animal {
	
	public Dog() {
		super("swag",18,60,"nicky");
		System.out.println("This animal is very good");
		System.out.println(super.getAnimalName());
		System.out.println(super.getAge());
		System.out.println(super.getNoOfAnimals());
		System.out.println(super.getNickName());
		System.out.println("constructor is ended");
		
	}

}
