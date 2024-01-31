class Projector {
 static String pName ;
      static   int ratings ;
  static      String Material ;
    static    boolean isGood ;
    static    String pColor ;
     static   int warrantyYears ;
     static   int Inch;
    public static void main(String[] args) {
        String pName="xyz" ;
        int ratings=8 ;
        String Material ="plastic";
        boolean isGood=true ;
        String pColor="white" ;
        int warrantyYears=10;
        int Inch=60;

        System.out.println(" Projector name is : " + pName);
        System.out.println(" int ratings of projector is: " + ratings);
        System.out.println("The material  of projector is: " + Material);
        System.out.println("Is projector good? " + isGood);
        System.out.println(" the inch is" + Inch);
        System.out.println("projector  Color is: " + pColor);
        System.out.println("projector Warranty Years: " +  warrantyYears);
}
}