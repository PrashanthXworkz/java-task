package Things;

public class Animal {
	
	private String animalName;
	private int age;
	private double noOfAnimals;
	private String nickName;
	
	public Animal() {
		System.out.println("The animal is there");
	}

	public Animal(String animalName, int age, double noOfAnimals, String nickName) {
		super();
		this.animalName = animalName;
		this.age = age;
		this.noOfAnimals = noOfAnimals;
		this.nickName = nickName;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getNoOfAnimals() {
		return noOfAnimals;
	}

	public void setNoOfAnimals(double noOfAnimals) {
		this.noOfAnimals = noOfAnimals;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
  
	
}
