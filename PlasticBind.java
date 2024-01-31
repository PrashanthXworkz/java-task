class PlasticBind {
static String pName  ;
    static    int ratings ;
        static String Material ;
   static     boolean isGood ;
     static   String pColor ;
     static   int warrantyYears ;
    static    int Price;
		
		
    public static void main(String[] args) {
        String pName = "abc";
        int ratings = 5;
        String Material = "Paper";
        boolean isGood = true;
        String pColor = "brown";
        int warrantyYears = 5;
        int Price= 30;

        System.out.println(" Bind name is : " + pName);
        System.out.println(" int ratings of bind is: " + ratings);
        System.out.println("The material  of bind is: " + Material);
        System.out.println("Is bind good? " + isGood);
        System.out.println(" the price is" + Price);
        System.out.println("bind Color is: " + pColor);
        System.out.println("bind Warranty Years: " +  warrantyYears);

       
}
}