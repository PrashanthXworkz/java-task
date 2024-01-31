class Bag {
      static String bagName ;
      static  int ratings ;
        static String Material ;
       static boolean isThere;
      static  String bagColors ;
       static int warrantyYears;
      static  int bagInch;
    public static void main(String[] args) {
        String bagName = "adventure";
        int ratings = 5;
        String Material = "cloth";
        boolean isThere = true;
        String bagColors = "green";
        int warrantyYears = 3;
        int bagInch=45;

        System.out.println("bag name is : " + bagName);
        System.out.println(" int ratings of bag is: " + ratings);
        System.out.println("The material  of bag is: " + Material);
        System.out.println("Is bag there? " + isThere);
        System.out.println(" the inch is" + bagInch);
        System.out.println("bag  Colors: " + bagColors);
        System.out.println("bag Warranty Years: " +  warrantyYears);
}
}