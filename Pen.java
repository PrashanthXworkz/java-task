class Pen{
//instance
String name;
int price;
String type;
String colour;

public void towrite(){
	System.out.println("pen is used for writing purpose");
}
public static void main(String args[]){
Pen pen=new Pen();
pen.name="renalds";
pen.price=60;
pen.type="jel";
pen.colour="blue";
System.out.println(pen.name +" " +pen.price + " "+ pen.type+ "" + pen.colour);
pen.towrite();
Pen pen1=new Pen();
pen1.name="brite";
pen1.price=30;
pen1.type="ball";
pen1.colour="red";
System.out.println(pen1.name +" " +pen1.price + " "+ pen1.type+ "" + pen1.colour);
pen1.towrite();
}
}