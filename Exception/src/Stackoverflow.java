
public class Stackoverflow {

	public static void main(String[] args) {
		 try {
		            recursiveMethod(1);
		        } catch (StackOverflowError e) {
		            System.out.println("StackOverflowError caught: " + e.getMessage());
		            throw new StackOverflowError();
		        }
		    }

		    public static void recursiveMethod(int value) {
		        System.out.println("Value: " + value);
		        recursiveMethod(value + 1);  
		    }
		}
