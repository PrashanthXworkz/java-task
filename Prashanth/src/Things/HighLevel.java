package Things;

public class HighLevel extends ProgrammingLanguage {
	
	public HighLevel() {
		super("java",8,"Eclipse",90);
		System.out.println("high level language is complted");
		System.out.println(super.getTypeChar());
		System.out.println(super.getLanguageName());
		System.out.println(super.getPercentage());
		System.out.println(super.getTypes());
		System.out.println("--------");
	}

}
