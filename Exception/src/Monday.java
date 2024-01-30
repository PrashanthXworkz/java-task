public class Monday {
	
 public static void main(String [] args){
		try{
			System.out.println("exception method handling");
			String contactNumber="9972381002s";
		    long number=Long.parseLong(contactNumber);
		    System.out.println("contact number is"+number);
		    
           }catch(Exception exception) {
			System.out.println("exception occured");
			throw new NumberFormatException();
		}
	}

}
