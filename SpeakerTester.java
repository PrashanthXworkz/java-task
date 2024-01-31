class SpeakerTester{
public static void main(String test[]){
System.out.println("main started");
 boolean connected=Speaker.onOroff();
System.out.println("Is Speaker connected" + connected);
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
         Speaker.decreseVolume();
         Speaker.decreseVolume();
     boolean connected1 = Speaker.onOroff();
	          Speaker.decreseVolume();
			           Speaker.decreseVolume();
System.out.println("Is Speaker connected" + connected1);
System.out.println("main ended");
}
}