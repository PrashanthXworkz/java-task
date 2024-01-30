
public class arrayindex {

	public static void main(String[] args) {
		        try {
		            int[] numbers = {1, 2, 3};
		            int value = numbers[5]; 
		            System.out.println("Value: " + value);
		        } catch (ArrayIndexOutOfBoundsException e) {
		            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
		        }
		 }

}
