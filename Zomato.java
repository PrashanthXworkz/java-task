class Zomato{

public static double search(String foodName){
if("pizza" == foodName){
System.out.println("searched food name is " +foodName);
return 99.00;
}
if("burger" == foodName){
System.out.println("searched food name is " +foodName);
return 66.00;
}
if("sandwich" == foodName){
System.out.println("searched food name is " +foodName);
return 189.00;
}
if("garlic bread" == foodName){
System.out.println("searched food name is " +foodName);
return 100.00;
}
if("pasta" == foodName){
System.out.println("searched food name is " +foodName);
return 62.40;
}
if("big pizza" == foodName){
System.out.println("searched food name is " +foodName);
return 200.00;
}
if("french fries" == foodName){
System.out.println("searched food name is " +foodName);
return 79.78;
}

return 0.0;
}
}