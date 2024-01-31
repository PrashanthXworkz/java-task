class Book{
//instance
String name;
String author;
int price;
String type;
String publicationName;
int noofPages;

public void gainKnowledge(){
	System.out.println("The book is getting a information");
}
public static void main(String args[]){
Book book =new Book();
book.name="bhagavadgita";
book.price=60;
book.type="story book";
book.author="RAM";
book.publicationName="Story Tales";
book.noofPages=80;
System.out.println(book.name +" " +book.price + " "+ book.type+ "" + book.author+""+book.publicationName+""+book.noofPages);
book.gainKnowledge();
Book book1=new Book();
book1.name="sangeeta";
book1.price=30;
book1.type="Songs books";
book1.author="Kuvempu";
book1.publicationName="Kannada Songs";
book1.noofPages=90;
System.out.println(book1.name +" " +book1.price + " "+ book1.type+ "" + book1.author+""+book1.publicationName+""+book1.noofPages);
book1.gainKnowledge();
}
}