class SwiggyTest{
public static void main(String[] args){

 
double price=Swiggy.search("pizza");
double pricewithquantity=Swiggy.search("pizza",2);
System.out.println("the food price  is"+price);
System.out.println("food pricewithquantity");

  price=Swiggy.search("burger");
 pricewithquantity=Swiggy.search("burger",2);
System.out.println("the food price is"+price);
System.out.println("the food pricewithquantity");

  price=Swiggy.search("sandwich");
  pricewithquantity= Swiggy.search("sandwich",2);
 System.out.println("the food price is"+price);
System.out.println("the food pricewithquantity");

 price=Swiggy.search("garlic bread");
 pricewithquantity=Swiggy.search("garlic bread",2);
System.out.println("the food price is"+price);
System.out.println("the food pricewithquantity");

 price=Swiggy.search("pasta");
 pricewithquantity=Swiggy.search("pasta",2);
System.out.println("the food price is"+price);
System.out.println("the food pricewithquantity");

 price=Swiggy.search("big pizza");
 pricewithquantity=Swiggy.search("big pizza",2);
System.out.println("the food price is"+price);
System.out.println("the food pricewithquantity");

 price=Swiggy.search("french fries");
 pricewithquantity=Swiggy.search("french fries",2);
System.out.println("the food price is"+price);
System.out.println("the food pricewithquantity");
}

}