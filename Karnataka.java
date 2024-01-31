class Karnataka{
/*static String city="Mandya";
static String city1="Shivamogga";
static String city2="raichur";
static String city3="davanagere";
static String city4="bengaluru";
static String city5="kolar";
static String city6="koppal";
static String city7="mysore";
static String city8="hubbali";
static String city9="tumkur";*/
static String cityIdentify[]={null,null,null,null,null,null,null,null,null,null};
static int index;

public static boolean cityNames(String city){
boolean isAdded=false;
if(index<cityIdentify.length){
	if(city!=null && city.length()>0){
		cityIdentify[index]=city;
		index++;
		isAdded=true;
		/*System.out.println("isAdded" +isAdded);*/
	}
	else{
		System.out.println("city not identify ,its a null value");
	}
}
else{
	System.out.println("Size is full,cann't add anymore");
}
	return  isAdded;

}
public static boolean updateCityName(String existingCityName,String updatedCityName){ 
    boolean isUpdated=false;
	for(int i=0;i<cityIdentify.length;i++){
		if(cityIdentify[i].equals(existingCityName)){
			cityIdentify[i]=updatedCityName;
			isUpdated=true;
		}
	}
	return isUpdated;
}
public static int deletecityName(String deletecityName){
	boolean isDeleted=false;
	int i;
	int noofElements=cityIdentify.length;
	for(i=0;i<cityIdentify.length;i++){
	if(cityIdentify[i].equals(deletecityName)){
	break;
	}
	}
	if(i<noofElements){
	noofElements=noofElements-1;
	for(int newItemIndex=i;newItemIndex<noofElements;newItemIndex++){
		cityIdentify[newItemIndex]=cityIdentify[newItemIndex+1];
	}
	}
	System.out.println(noofElements);
	return noofElements;
}
public static void getAllcityPostDeleteName(int newLength){
	for(int i=0;i<newLength;i++){
		System.out.println(cityIdentify[i]);
	}
}
public static void getIdentify(){
System.out.println("invoking get Identify all places");
for(int i=0;i<cityIdentify.length;i++){
	String reference=cityIdentify[i];
	System.out.println("acccesing value " + reference  + " at " + i);
}
System.out.println("ending get Identify all places ");

}
public static String searchStateCityByName(String cityName){
	System.out.println("Invoking city names");
	String sName=null;
	for(String name:cityIdentify){
		if(name.equals(cityName)){
			sName=name;
			System.out.println("city Name found");
		}
	}
	return sName;
}
}