class  CriketMania{
static String batsman[]={"virat kohli" , "david warner" , "ruturaj" , "faf du" , "ishan" , "ajinkya" , "chris gayle" , "rashid khan" , "mohammad shami" , "mohit sharma"};
static String IccRanking[]={"Australia" , "India" , "pakistan" , "england" , "SA" , "Bangladesh" , "NZ" , "srilanka" , "west indis" , "america"};
static String IPLnames[]={"CSK" , "GT" , "LSG" , "MI" , "RR" , " RCB" , "KKR" , "PBKS", "DC" , "SRH"};
public static void main(String mania[]){
 System.out.println("main started");
System.out.println("List of batsman are:");
System.out.println(batsman[0] + "  "+ batsman[1] + "   "+ batsman[2] + "  " + batsman[3] + "   "+ batsman[4] + "   "+ batsman[5] + "  "+ batsman[6] + "   "+ batsman[7] + "  " + batsman[8] + "  " + batsman[9] );
System.out.println("List of IccRanking are:");
System.out.println(IccRanking[0] + "  "+ IccRanking[1] + "   "+ IccRanking[2] + "  " + IccRanking[3] + "   "+ IccRanking[4] + "   "+ IccRanking[5] + "  "+ IccRanking[6] + "   "+ IccRanking[7] + "  " + IccRanking[8] + "  " + IccRanking[9] );
System.out.println("List of IPLnames are:");
System.out.println(IPLnames[0] + "  "+ IPLnames[1] + "   "+ IPLnames[2] + "  " + IPLnames[3] + "   "+ IPLnames[4] + "   "+ IPLnames[5] + "  "+ IPLnames[6] + "   "+ IPLnames[7] + "  " + IPLnames[8] + "  " + IPLnames[9] );
System.out.println("main ended");
System.out.println(IPLnames.length);

System.out.println(IccRanking.length);

System.out.println(batsman.length);

 }
}