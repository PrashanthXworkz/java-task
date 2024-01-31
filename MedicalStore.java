class MedicalStore{
/*static String tablet="Adderall";
static String tablet1="Ativan";
static String tablet2="Brilinta";
static String tablet3="Lyrica";
static String tablet4="Cymbalta";
static String tablet5="Nurtec";
static String tablet6="Metoprolol";
static String tablet7="Plan B";
static String tablet8="Farxiga";
static String tablet9="Humira";*/
static String TabletNames[]={null,null,null,null,null,null,null};
static int index;

public static boolean Medicine(String Name){
boolean isAdded=false;
	if(TabletNames!=null){
		TabletNames[index]=Name;
		index++;
		isAdded=true;
	}
	else{
		System.out.println("Medicine is there");
	}
	return  isAdded;
}
public static boolean updatetabletName(String existingtabletName,String updatedtabletName){ 
    boolean isUpdated=false;
	for(int i=0;i<TabletNames.length;i++){
		if(TabletNames[i].equals(existingtabletName)){
			TabletNames[i]=updatedtabletName;
			isUpdated=true;
		}
	}
	return isUpdated;
}
public static int deletetabName(String deletemedName){
	boolean isDeleted=false;
	int i;
	int noofElements=TabletNames.length;
	for(i=0;i<TabletNames.length;i++){
	if(TabletNames[i].equals(deletemedName)){
	break;
	}
	}
	if(i<noofElements){
	noofElements=noofElements-1;
	for(int newItemIndex=i;newItemIndex<noofElements;newItemIndex++){
		TabletNames[newItemIndex]=TabletNames[newItemIndex+1];
	}
	}
	System.out.println(noofElements);
	return noofElements;
}
public static void getAllmedPostDeleteName(int newLength){
	for(int i=0;i<newLength;i++){
		System.out.println(TabletNames[i]);
	}
}
public static void medical(){
System.out.println("invoking medical");
for(int r=0;r<TabletNames.length;r++){
	String reference=TabletNames[r];
	System.out.println("acccesing value " + reference  + " at " + r);
}
System.out.println("ending with medical ");

}
public static void main(String args[]){
MedicalStore.Medicine("Adderall");
MedicalStore.Medicine("Ativan");
MedicalStore.Medicine("Brilinta");
MedicalStore.Medicine("Nurtec");
MedicalStore.Medicine("Metoprolol");
MedicalStore.Medicine("Plan B");
MedicalStore.Medicine("Humira");
MedicalStore.medical();
boolean isUpdated=MedicalStore.updatetabletName("Nurtec","B comolex");
System.out.println("The upadated tablet is added" + isUpdated);
MedicalStore.medical();
int newLength =MedicalStore.deletetabName("Plan B");
System.out.println("calling getAlldeliciousPostDeleteName");
MedicalStore.getAllmedPostDeleteName(newLength);
}
}
