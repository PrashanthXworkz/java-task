package Things;

public class Stationary {
	//main class
	public  String stationaryName;
	public  int noOfBooks;
	public long stationaryPhoneNumber;
	
	public Stationary() {
		System.out.println("no-arg constructor");	
		}
	
	
	public Stationary(String stationaryName, int noOfBooks, long stationaryPhoneNumber) {
		this.stationaryName = stationaryName;
		this.noOfBooks = noOfBooks;
		this.stationaryPhoneNumber = stationaryPhoneNumber;
	}

	
  //inner class or nested class
	public class Books{
		public String bookName;
		public String bookAuthor;
		public int noOfPages;
		public double price;
		
		public Books() {
			System.out.println("no-arg constructor");
		}
		
		
		public Books(String bookName, String bookAuthor, int noOfPages, double price) {
			super();
			this.bookName = bookName;
			this.bookAuthor = bookAuthor;
			this.noOfPages = noOfPages;
			this.price = price;
		}

		
	}

}
