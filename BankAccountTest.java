class BankAccountTest{
public static void main(String account[]){
System.out.println("main started");
BankAccount.credit(2000);
 double currentBalance=BankAccount.getBalance();
 System.out.println(currentBalance);
BankAccount.debit(900);
double currentBalance1=BankAccount.getBalance();
 System.out.println(currentBalance1);
System.out.println("main ended");
}
}