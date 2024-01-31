package Driver;

import Things.Dog;

public class DogRunner {
	public static void main(String [] args) {
		Dog dog=new Dog();
		dog.setAnimalName("Lamber");
		dog.setAge(20);
		dog.setNickName("Leo");
		dog.setNoOfAnimals(50);
		
		String name=dog.getAnimalName();
		System.out.println("The name is:"+name);
		int age=dog.getAge();
		System.out.println("The age of animal is:"+age);
		String nick=dog.getNickName();
		System.out.println("The nick Name is:"+nick);
		double ani=dog.getNoOfAnimals();
		System.out.println("The count is:"+ani);
		
	}

}

