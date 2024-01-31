package Driver;


import Things.Bank;
import Things.Account;
import Things.Payment;
import Things.FD;
import Things.RD;
import Things.Online;

public class BankRunner {
	public static void main(String args[]) {
		Bank bank=new Bank();
		bank.setNoOfBranches(12);
		bank.setIfscCode("abc12");
		bank.setAccounts(100);
	    bank.getAccount();
     	bank.getPayment();
		
     	System.out.println(bank.getAccounts());
		System.out.println(bank.getNoOfBranches());
		System.out.println(bank.getIfscCode());
	
		
		
		
		
		
		Account account=new Account();
		account.setAcnumber(2341);
		account.setPhoneNumber(997238100);
		account.setAcName("bharat");
		bank.setAccount(account);
		System.out.println(account.getAcnumber());
	    System.out.println(account.getAcName());
		System.out.println(account.getPhoneNumber());
	
		
		
		
		Payment payment=new Payment();
		payment.setTransaction(true);
		payment.setBalance(3000);
		payment.setTypeOfMode("phonepay");
		bank.setPayment(payment);
		System.out.println(payment.getBalance());
		System.out.println(payment.isTransaction());
		System.out.println(payment.getTypeOfMode());
		
		
		
		
		FD fd =new FD();
		fd.setBankName("Canara");
		fd.setAmount(32);
		fd.setCredited(500);
		bank.getAccount().setFd(fd);
		System.out.println(fd.getBankName());
		System.out.println(fd.getAmount());
		System.out.println(fd.getCredited());
		
		RD rd=new RD();
		rd.setAmount(78);
		rd.setDay("saturday");
		rd.setDeposit(98);
		bank.getAccount().setRd(rd);
		System.out.println(rd.getAmount());
		System.out.println(rd.getDay());
		System.out.println(rd.getDeposit());
		
		Online online=new Online();
		online.setWebsite("www.xworkz");
		online.setNetworks(6);
		online.setConnected(true);
		bank.getPayment().setOnline(online);
		System.out.println(online.getNetworks());
		System.out.println(online.getWebsite());
		System.out.println(online.isConnected());
		
		}

}

