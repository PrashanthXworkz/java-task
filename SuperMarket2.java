class SuperMarket2{
//array variable
static String Vegetables[] ={"potato" , "carrot" , "onion" , "beans" , "brinjal"};
static String  Biccuits[] ={"parleg", "britania" , "goodday" , "darkfantasy" , "happyhappy" , "fiftyfifty" , "marilight" , "darkcream" , "oreo" , "fantasy"};
static String Perfumes[] ={"denver" , "fog" , "chanel" , "engage" , "mental" , "sue" , "tued" , "aba" , "xyz" ,"def"};
public static void main(String market[]){
//perfumes
System.out.println("main started");
getPerfumes();
System.out.println("main ended");
//biccuits
System.out.println("main started");
System.out.println("List of biccuits are:");
getBiccuits();
//System.out.println(biccuits[0] + "  "+ biccuits[1] + "   "+ biccuits[2] + "  " + biccuits[3] + "   "+ biccuits[4] + "   "+ biccuits[5] + "  "+ biccuits[6] + "   "+ biccuits[7] + "  " + biccuits[8] + "  " + biccuits[9]);
System.out.println("main ended");
// vegetable
System.out.println("main started");
System.out.println("List of vegetables are:");
getVegetables();
//System.out.println(vegetable[0] + "  "+ vegetable[1] + "   "+ vegetable[2] + "  " + vegetable[3] + "   "+ vegetable[4] );
System.out.println("main ended");
System.out.println(Vegetables.length);

}
public static void getPerfumes(){
          System.out.println("Inside getPerfumes");
		  for(String Perfume:Perfumes){
			  System.out.println(Perfume);
		  }
}
public static void getBiccuits(){
	       System.out.println("Inside getBiccuits");
		   for(String Biccuit:Biccuits){
			   System.out.println(Biccuit);
		   }
}
public static void getVegetables(){
	for(String Vegetable:Vegetables){
		System.out.println(Vegetable);
	}
}
}