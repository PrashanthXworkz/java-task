class IcecreamParlour{
static String Flavours[]={null,null,null,null,null,null,null,null,null,null};
static int index;

public static boolean flavourName(String ice){
boolean isAdded=false;
	if(Flavours!=null){
		Flavours[index]=ice;
		index++;
		isAdded=true;
	}
	else{
		System.out.println("null value is always null");
	}
	return  isAdded;
}
public static boolean updateflavourName(String existingflavourName,String updatedflavourName){ 
    boolean isUpdated=false;
	for(int i=0;i<Flavours.length;i++){
		if(Flavours[i].equals(existingflavourName)){
			Flavours[i]=updatedflavourName;
			isUpdated=true;
		}
	}
	return isUpdated;
}
public static int deleteflavourName(String deleteflavourName){
	boolean isDeleted=false;
	int i;
	int noofElements=Flavours.length;
	for(i=0;i<Flavours.length;i++){
	if(Flavours[i].equals(deleteflavourName)){
	break;
	}
	}
	if(i<noofElements){
	noofElements=noofElements-1;
	for(int newItemIndex=i;newItemIndex<noofElements;newItemIndex++){
		Flavours[newItemIndex]=Flavours[newItemIndex+1];
	}
	}
	System.out.println(noofElements);
	return noofElements;
}
public static void getAlldeliciousPostDeleteName(int newLength){
	for(int i=0;i<newLength;i++){
		System.out.println(Flavours[i]);
	}
}
public static void delicious(){
System.out.println("invoking delicious flavours");
for(int p=0;p<Flavours.length;p++){
	String reference=Flavours[p];
	System.out.println("acccesing value " + reference  + " at " + p);
}
System.out.println("ending with delicious ");

}
}
