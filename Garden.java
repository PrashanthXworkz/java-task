class Garden{
/*static String flower="Red Rose";
static String flower1="Sun Flower";
static String flower2="Lotus";
static String flower3="orchid";
static String flower4="tulip";
static String flower5="pansy";
static String flower6="peony";
static String flower7="iris";
static String flower8="lily";
static String flower9="daisy";*/
static String Flower[]={null,null,null,null,null,null,null,null,null,null};
static int index;

public static boolean flowerName(String Nice){
boolean isAdded=false;
	if(Flower!=null){
		Flower[index]=Nice;
		index++;
		isAdded=true;
	}
	else{
		System.out.println("Flower is not visible,its a null value");
	}
	return  isAdded;
}
public static boolean updateflowerName(String existingflowerName,String updatedflowerName){ 
    boolean isUpdated=false;
	for(int i=0;i<Flower.length;i++){
		if(Flower[i].equals(existingflowerName)){
			Flower[i]=updatedflowerName;
			isUpdated=true;
		}
	}
	return isUpdated;
}
public static int deleteflowerName(String deleteflowerName){
	boolean isDeleted=false;
	int i;
	int noofElements=Flower.length;
	for(i=0;i<Flower.length;i++){
	if(Flower[i].equals(deleteflowerName)){
	break;
	}
	}
	if(i<noofElements){
	noofElements=noofElements-1;
	for(int newItemIndex=i;newItemIndex<noofElements;newItemIndex++){
		Flower[newItemIndex]=Flower[newItemIndex+1];
	}
	}
	System.out.println(noofElements);
	return noofElements;
}
public static void getAllflowerPostDeleteName(int newLength){
	for(int i=0;i<newLength;i++){
		System.out.println(Flower[i]);
	}
}
public static void visible(){
System.out.println("invoking visible flowers");
for(int a=0;a<Flower.length;a++){
	String reference=Flower[a];
	System.out.println("acccesing value " + reference  + " at " + a);
}
System.out.println("ending with visible ");

}
public static void main(String args[]){
	Garden.flowerName("Red Rose");
	Garden.flowerName("Lotus");
	Garden.flowerName("iris");
	Garden.flowerName("lily");
	Garden.flowerName("orchid");
	Garden.flowerName("pansy");
	Garden.flowerName("peony");
	Garden.flowerName("Sun Flower");
	Garden.flowerName("tulip");
	Garden.flowerName("daisy");
Garden.visible();
boolean isUpdated=Garden.updateflowerName("Red Rose","pink Rose");
System.out.println("The upadated flower is added" + isUpdated);
Garden.visible();
int newLength =Garden.deleteflowerName("tulip");
System.out.println("calling getAlldeliciousPostDeleteName");
Garden.getAllflowerPostDeleteName(newLength);
}
}
