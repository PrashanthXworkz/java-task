class  Giriyas{
public static void main(String args[]){
 System.out.println("Main started");
  String electronicdevices[]={"refrigerator" , "Washing Machine" , "Television" , "LED" , "grinder" , "AC" , "Iron box" , "Microwave"};
  
  double priceofelectronicdevices[]={50000.00 , 40000.00 , 65000.00 , 18000.70 , 14000.45 , 35000.00 ,00000.95 ,35000.76};
  for(String electronicdevice : electronicdevices){
  System.out.println(electronicdevice);
  }
  for(double priceofelectronicdevice : priceofelectronicdevices){
  System.out.println(priceofelectronicdevice);
  }
  System.out.println("Main ended");
  }
  }