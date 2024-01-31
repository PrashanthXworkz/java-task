class  Criket{
static String batsman[]={"virat kohli" , "david warner" , "ruturaj" , "faf du" , "ishan" , "ajinkya" , "chris gayle" , "rashid khan" , "mohammad shami" , "mohit sharma"};
static String IccRanking[]={"Australia" , "India" , "pakistan" , "england" , "SA" , "Bangladesh" , "NZ" , "srilanka" , "west indis" , "america"};
static String IPLnames[]={"CSK" , "GT" , "LSG" , "MI" , "RR" , " RCB" , "KKR" , "PBKS", "DC" , "SRH"};
public static void main(String mania[]){

 System.out.println("main started");

for(int j=0;j<batsman.length;){
System.out.println(batsman[j]);
j++;}

for(int i=0;i<IccRanking.length;){
System.out.println(IccRanking[i]);
i++;}

for(int k=0;k<IPLnames.length;){
System.out.println(IPLnames[k]);
k++;}
System.out.println("main ended");
System.out.println(IPLnames.length);

System.out.println(IccRanking.length);

System.out.println(batsman.length);

 }
}