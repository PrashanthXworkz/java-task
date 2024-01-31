package Things;

public class ProgrammingLanguage {
	
	private String languageName;
	private int types;
	private String typeChar;
	private float percentage;
	
	public ProgrammingLanguage() {
		System.out.println("programming language is good");
	}

	public ProgrammingLanguage(String languageName, int types, String typeChar, float percentage) {
		super();
		this.languageName = languageName;
		this.types = types;
		this.typeChar = typeChar;
		this.percentage = percentage;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public int getTypes() {
		return types;
	}

	public void setTypes(int types) {
		this.types = types;
	}

	public String getTypeChar() {
		return typeChar;
	}

	public void setTypeChar(String typeChar) {
		this.typeChar = typeChar;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	
	

}
