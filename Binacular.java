class Binacular{
String typeofLens;
String brandName;
double price;

public Binacular(){
System.out.println("Binocular const is invoked");
}
public Binacular(String typeofLens,String brandName){
	this(10000.00);//constructor chaining and this() method
this.typeofLens=typeofLens;
this.brandName=brandName;
}
public Binacular(double price){
	this();
this.price=price;
}
public static void main(String args[]){
Binacular binacular=new Binacular("convex","cannon");
//binacular.typeofLens="convex";
//binacular.brandName="cannon";
//binacular.price=10000.00;
System.out.println(binacular.typeofLens+"  "+binacular.brandName+"  "+binacular.price);

}
}
//Marker and LensKart