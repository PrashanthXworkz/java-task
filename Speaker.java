class Speaker{
static String name="JBL";
static  int minVolume;
static  int currentVolume;
static  int maxVolume=6;
static boolean isConnected;
//onOroff
public static boolean onOroff(){
	System.out.println("Invoking onOroff");
	System.out.println("" + 0);
	if(isConnected == false){
		isConnected=true;
		System.out.println("speaker is turnedonnn....enjoy");
	}else if(isConnected==true){
		isConnected=false;
		System.out.println("speaker is turnedoff");
	}
	return isConnected;
}
//increaseVolume
public static void increaseVolume(){
	System.out.println("increaseVolume started");
	if(isConnected== true){
	if(currentVolume<maxVolume){
		currentVolume=currentVolume+1;
		System.out.println("The currentVolume is " + currentVolume);
	}
	else{
		System.out.println("maxVolume is reached");
	}
	}
	else{
		System.out.println("Hey speaker connect madu");
	}
	System.out.println("increaseVolume ended");
}
//decreseVolume
public static void decreseVolume(){
	System.out.println("decreseVolume started");
	if(isConnected==true){
	if(currentVolume>maxVolume){
		currentVolume=currentVolume-1;
		System.out.println("The currentVolume is " + currentVolume);
	}
//	else{
		System.out.println("minVolume is reached");
	}//
	}
//	else{
		System.out.println("Hey speaker ");
	}//
	System.out.println("decreseVolume ended");
}
}