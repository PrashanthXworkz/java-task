class ChaiPointer{
static String tea="Masala Tea";
static String tea1="ginger Tea";
static String tea2="kesar elachi Tea";
static String tea4="irani Tea";
static String tea5="ayurvedic Tea";
static String tea6="filter Tea";
static String tea7="lemon Tea";
static String tea8="green Tea";
static String tea9="sulemani Tea";
static String tea10="ajwan Tea";
static String chaiAvailable[]={tea,null,null,null};
 static int index;
//reference values to print the array-available(reference)
public static boolean addChai(String chai){
	boolean isAdded=false;
	if(chai!=null){
		chaiAvailable[index]=chai;
		index++;
		isAdded=true;
	}
	else{
		System.out.println("cannot add chai,as it is null value");
	}
	return  isAdded;
}

public static void getAllChaiAvailable(){
System.out.println("invoking getAllChaiAvailable");
for(int i=0;i<chaiAvailable.length;i++){
	String reference=chaiAvailable[i];
	System.out.println("acccesing value " + reference  + " at " + i);
}
System.out.println("ending getAllChaiAvailable");

/*for(String available:chaiAvailable){
System.out.println(available);
}*/
}
}