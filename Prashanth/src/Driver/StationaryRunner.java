package Driver;

import Things.Stationary;
import Things.Stationary.Books;

public class StationaryRunner {
	public static void main(String [] args) {
		Stationary shop=new Stationary();
		shop.noOfBooks=60;
		shop.stationaryName="Vignesh";
		shop.stationaryPhoneNumber=9972381002l;
		
		System.out.println("The name of Stationary is:"+shop.stationaryName);
		System.out.println("The phonenumber is:"+shop.stationaryPhoneNumber);
		System.out.println("The number of books is :"+shop.noOfBooks);
		
		
		Books book=shop.new Books();
		book.bookAuthor="R.K Raj";
		book.bookName="kavishailya";
		book.noOfPages=90;
		book.price=120;
		System.out.println("book author is:"+book.bookAuthor);
		System.out.println("book name is:"+book.bookName);
		System.out.println("no of pages:"+book.noOfPages);
		System.out.println("book price is:"+book.price);
		
	}

}
