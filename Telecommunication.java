class Telecommunication{
/*static String sim="Reliance Jio";
static String sim1="Airtel";
static String sim2="vodafone";
static String sim3="BSNL";
static String sim4="MTNL";*/

static String simCards[]={null,null,null,null,null};
static int index;

public static boolean simName(String sim){
boolean isAdded=false;
	if(sim!=null){
		simCards[index]=sim;
		index++;
		isAdded=true;
	}
	else{
		System.out.println("SIM is not identify ,its a null value");
	}
	return  isAdded;
}
public static boolean updateSimName(String existingSimName,String updatedSimName){ 
    boolean isUpdated=false;
	for(int i=0;i<simCards.length;i++){
		if(simCards[i].equals(existingSimName)){
			simCards[i]=updatedSimName;
			isUpdated=true;
		}
	}
	return isUpdated;
}
public static int deletesimName(String deletesimName){
	boolean isDeleted=false;
	int i;
	int noofElements=simCards.length;
	for(i=0;i<simCards.length;i++){
	if(simCards[i].equals(deletesimName)){
	break;
	}
	}
	if(i<noofElements){
	noofElements=noofElements-1;
	for(int newItemIndex=i;newItemIndex<noofElements;newItemIndex++){
		simCards[newItemIndex]=simCards[newItemIndex+1];
	}
	}
	System.out.println(noofElements);
	return noofElements;
}
public static void getAllsimPostDeleteName(int newLength){
	for(int i=0;i<newLength;i++){
		System.out.println(simCards[i]);
	}
}

public static void getNetwork(){
System.out.println("invoking get Network in all areas");
for(int j=0;j<simCards.length;j++){
	String reference=simCards[j];
	System.out.println("acccesing value " + reference  + " at " + j);
}
System.out.println("ending network all places ");

}
}