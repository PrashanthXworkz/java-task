package Driver;
import Things.HighLevel;

public class ProgramRunner {

	public static void main(String [] args) {
		HighLevel high=new HighLevel();
		high.setLanguageName("python");
		high.setPercentage(100);
		high.setTypeChar("pycharm");
		high.setTypes(6);
		System.out.println(high.getLanguageName());
		System.out.println(high.getPercentage());
		System.out.println(high.getTypeChar());
		System.out.println(high.getTypes());
		
		
	}
}
