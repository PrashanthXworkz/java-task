class IcecreamParlourTest{
public static void main(String args[]){
	IcecreamParlour.flavourName("Ice Cream");
	IcecreamParlour.flavourName("gelato");
	IcecreamParlour.flavourName("gudbud");
	IcecreamParlour.flavourName("italian ice");
	IcecreamParlour.flavourName("choclate ice");
	IcecreamParlour.flavourName("frozen yogurt");
	IcecreamParlour.flavourName("sorbet");
	IcecreamParlour.flavourName("dazs");
	IcecreamParlour.flavourName("chocobar");
	IcecreamParlour.flavourName("falooda");
IcecreamParlour.delicious();

boolean isUpdated=IcecreamParlour.updateflavourName("Ice Cream","Venilla");
System.out.println("The upadated flower is added" + isUpdated);
IcecreamParlour.delicious();

int newLength =IcecreamParlour.deleteflavourName("gudbud");
System.out.println("calling getAlldeliciousPostDeleteName");
IcecreamParlour.getAlldeliciousPostDeleteName(newLength);
}
}