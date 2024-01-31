class Aeroplane{
String name;
int noofSeats;
public Aeroplane(){
	this();
	//System.out.println("areoplane is invoked");
	/*Aeroplane aero1=new Aeroplane();        //stackoverflow so it is not print both onject -recurssion will occur
	aero1.name="Indigo";
	aero1.noofSeats=230;
	System.out.println(aero1.name+" "+aero1.noofSeats);*/
}
/*public Aeroplane(String name,int noofSeats){
this.name=name;
this.noofSeats=noofSeats;
}*/
/*public static void createInstance(){
 Aeroplane aero=new Aeroplane("India",20);
System.out.println(aero.name+" "+aero.noofSeats);
}*/

public static void main(String args[]){
/*Aeroplane.createInstance();
Aeroplane aero=new Aeroplane("India",20);
System.out.println(aero.name+" "+aero.noofSeats);*/
Aeroplane aero=new Aeroplane();
	aero.name="Jeva";
	aero.noofSeats=290;
	System.out.println(aero.name+" "+aero.noofSeats);
}
}

