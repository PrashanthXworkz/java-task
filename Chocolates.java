class Chocolates{
//instance
String name;
String flavour;
int price;
String colour;
String design;

public void getdelicious(){
	System.out.println("The chocolate is more sweet and delicious");
}
public static void main(String args[]){
Chocolates coco =new Chocolates();
coco.name="dairy milk";
coco.price=60;
coco.flavour="strong sweet";
coco.colour="brown";
coco.design="rectangle shaped";
System.out.println(coco.name +" " +coco.price + " "+ coco.flavour+ "" + coco.colour+""+coco.design);
coco.getdelicious();
Chocolates coco1 =new Chocolates();
coco1.name="milky bar";
coco1.price=30;
coco1.flavour="super";
coco1.colour="white";
coco1.design="rectangle";
System.out.println(coco1.name +" " +coco1.price + " "+ coco1.flavour+ "" + coco1.colour+""+coco1.design);
coco1.getdelicious();
}
}