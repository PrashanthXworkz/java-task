class Metro{

static String Station[]={null,null,null,null,null,null,null,null,null,null};
static int index;

public static boolean stationName(String Train){
boolean isAdded=false;
	if(Station!=null){
		Station[index]=Train;
		index++;
		isAdded=true;
	}
	else{
		System.out.println("Station doesn't stop,it's a null value");
	}
	return  isAdded;
}
public static boolean updatestationName(String existingstationName,String updatedstationName){ 
    boolean isUpdated=false;
	for(int i=0;i<Station.length;i++){
		if(Station[i].equals(existingstationName)){
			Station[i]=updatedstationName;
			isUpdated=true;
		}
	}
	return isUpdated;
}
public static int deletestationName(String deletestationName){
	boolean isDeleted=false;
	int i;
	int noofElements=Station.length;
	for(i=0;i<Station.length;i++){
	if(Station[i].equals(deletestationName)){
	break;
	}
	}
	if(i<noofElements){
	noofElements=noofElements-1;
	for(int newItemIndex=i;newItemIndex<noofElements;newItemIndex++){
		Station[newItemIndex]=Station[newItemIndex+1];
	}
	}
	System.out.println(noofElements);
	return noofElements;
}
public static void getAllstationPostDeleteName(int newLength){
	for(int i=0;i<newLength;i++){
		System.out.println(Station[i]);
	}
}
public static void metrostop(){
System.out.println("invoking metro stop");
for(int k=0;k<Station.length;k++){
	String reference=Station[k];
	System.out.println("acccesing value " + reference  + " at " + k);
}
System.out.println("ending with metro stop ");

}
public static void main(String args[]){
	Metro.stationName("KBS");
	Metro.stationName("vijaya nagar");
	Metro.stationName("tollgate");
	Metro.stationName("National college");
	Metro.stationName("KR market");
	Metro.stationName("attiguppe");
	Metro.stationName("dasarahalli");
	Metro.stationName("Basavanagudi");
	Metro.stationName("bhsyham");
	Metro.stationName("rajaji nagar");

Metro.metrostop();
boolean isUpdated=Metro.updatestationName("tollgate","jayanagar");
System.out.println("The upadated city is added" + isUpdated);
Metro.metrostop();
int newLength =Metro.deletestationName("bhsyham");
System.out.println("calling getAlldeliciousPostDeleteName");
Metro.getAllstationPostDeleteName(newLength);
}
}
