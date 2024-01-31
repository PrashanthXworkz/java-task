class Factorial{
public static int getFact(int num){
int fact=1;
for(int f=1;f<=num;f++){
fact=f*fact;
}
return fact;
}
public static void main(String args[])
{
int number=Factorial.getFact(6);
System.out.println(number);
}
}