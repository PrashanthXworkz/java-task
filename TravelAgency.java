class TravelAgency{
/*static String place="Agumbe";
static String place1="Keladi";
static String place2="Ikkeri";
static String place3="Jog Falls";
static String place4="Kavaledurga";
static String place5="Kundadri";
static String place6="Kolluru";
static String place7="Madugiri";
static String place8="Sulekere";
static String place9="Sirsi";*/
static String Touristplace[]={null,null,null,null,null,null,null,null,null,null};
static int index;

public static boolean tourist(String Trip){
boolean isAdded=false;
	if(Touristplace!=null){
		Touristplace[index]=Trip;
		index++;
		isAdded=true;
	}
	else{
		System.out.println("Place is not visited,it's a null value");
	}
	return  isAdded;
}
public static boolean updatetouristName(String existingtouristName,String updatedtouristName){ 
    boolean isUpdated=false;
	for(int i=0;i<Touristplace.length;i++){
		if(Touristplace[i].equals(existingtouristName)){
			Touristplace[i]=updatedtouristName;
			isUpdated=true;
		}
	}
	return isUpdated;
}
public static int deletetouristName(String deletecityName){
	boolean isDeleted=false;
	int i;
	int noofElements=Touristplace.length;
	for(i=0;i<Touristplace.length;i++){
	if(Touristplace[i].equals(deletecityName)){
	break;
	}
	}
	if(i<noofElements){
	noofElements=noofElements-1;
	for(int newItemIndex=i;newItemIndex<noofElements;newItemIndex++){
		Touristplace[newItemIndex]=Touristplace[newItemIndex+1];
	}
	}
	System.out.println(noofElements);
	return noofElements;
}
public static void getAllplacePostDeleteName(int newLength){
	for(int i=0;i<newLength;i++){
		System.out.println(Touristplace[i]);
	}
}
public static void tourism(){
System.out.println("invoking tourism");
for(int m=0;m<Touristplace.length;m++){
	String reference=Touristplace[m];
	System.out.println("acccesing value " + reference  + " at " + m);
}
System.out.println("ending with tourism ");

}
public static void main(String args[]){
TravelAgency.tourist("Agumbe");
TravelAgency.tourist("Keladi");
TravelAgency.tourist("Ikkeri");
TravelAgency.tourist("Jog Falls");
TravelAgency.tourist("Kavaledurga");
TravelAgency.tourist("Kundadri");
TravelAgency.tourist("Kolluru");
TravelAgency.tourist("Madugiri");
TravelAgency.tourist("Sulekere");
TravelAgency.tourist("Sirsi");

TravelAgency.tourism();
boolean isUpdated=TravelAgency.updatetouristName("Madugiri","Udupi");
System.out.println("The upadated tourism is added" + isUpdated);
TravelAgency.tourism();
int newLength =TravelAgency.deletetouristName("Sirsi");
System.out.println("calling getAlldeliciousPostDeleteName");
TravelAgency.getAllplacePostDeleteName(newLength);
}
}
