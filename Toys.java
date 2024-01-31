class Toys {
     String name;
     String color;
     String size;
    double price;
    String brand;

public Toys(String name,String color,String size,double price,String brand){
	this.name=name;
     this.color=color;
      this.size=size;
    this.price=price;
     this.brand=brand;
}
    public void inToys() {
         System.out.println("The children are playing with toys");
    }

    public static void main(String[] args) {
        Toys toy1 = new Toys("teddy bear","brown","medium",19.99,"ABC toys");
		/*toy1.name="Teddy Bear";
		toy1.color="Brown";
		toy1.size="Medium";
		toy1.price=19.99;
		toy1.brand="ABC Toys";*/
		System.out.println(toy1.name+" "+toy1.color+ "" + toy1.size + ""+ toy1.price + "" +toy1.brand);
		toy1.inToys();
        Toys toy2 = new Toys("LEGO set","multicolor","large",49.99,"LEGO");
		/*toy2.name="LEGO Set";
		toy2.color="multicolor";
		toy2.size="large";
		toy2.price=49.99;
		toy2.brand="LEGO";*/
		System.out.println(toy2.name+" "+toy2.color+ "" + toy2.size + ""+ toy2.price + "" +toy2.brand);
		toy2.inToys();
        Toys toy3 = new Toys("doll","pink","small",9.99,"XYZ toys");
        /*toy3.name="Doll";
		toy3.color="Pink";ssss
		toy3.size="Small";
		toy3.price=9.99;
		toy3.brand="XYZ Toys";*/
		System.out.println(toy3.name+" "+toy3.color+ "" + toy3.size + ""+ toy3.price + "" +toy3.brand);
		toy3.inToys();
    }
}
