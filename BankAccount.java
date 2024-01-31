class BankAccount{
static  double balance;

//credited
public static boolean credit(int amount){
boolean isCredited=false;
if(amount>=0){
	balance=balance+amount;
	isCredited=true;
}
return isCredited;
 }

//debited
public static boolean debit(int amount){
	boolean isDebited=false;
if(amount<=balance){
	balance=balance-amount;
	isDebited=true;
}
return isDebited;

}
public static double getBalance(){
	return balance;
}
}