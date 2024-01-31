 public class Bank1{
        private int bankId;
        private String bankName;
        private String branch;
        private int branchCode ;
        private String address;
        private long helplineNo;
        private String branchManager;
        private String ifscCode;
        private  String miscCode;
        private  int noofLockers;
        private  int noofEmployees;
        private int timings;
        private String websiteDetails ;

public void setBankId(int bankId){
this.bankId=bankId;
}
public int getBankId(){
 return bankId;
 }
 public void setBankName(String bankName){
this.bankName=bankName;
}
public String  getBankName(){
 return bankName;
 }
 public void setBranch(String branch){
this.branch=branch;
}
public String getBranch(){
 return branch;
 }
 public void setBranchCode(int branchCode){
this.branchCode=branchCode;
}
public int getBranchCode(){
 return branchCode;
 }
 public void setAddress(String address){
this.address=address;
}
public String getAddress(){
 return address;
 }
 public void setHelplineNo(long helplineNo){
this.helplineNo=helplineNo;
}
public long  getHelplineNo(){
 return helplineNo;
 }
 public void setBankManager(String branchManager){
this.branchManager=branchManager;
}
public String getBankManager(){
 return branchManager;
 }
 public void setBankCode(String ifscCode ){
this.ifscCode=ifscCode;
}
public String getBankCode(){
 return ifscCode;
 }
 public void setMisc(String miscCode){
this.miscCode=miscCode;
}
public String  getMisc(){
 return miscCode;
 }
 public void setLockers(int noofLockers){
this.noofLockers=noofLockers;
}
public int getLockers(){
 return noofLockers;
 }
 public void setEmployee(int noofEmployees){
this.noofEmployees=noofEmployees;
}
public int getEmployee(){
 return noofEmployees;
 }
 public void setTime(int timings){
this.timings=timings;
}
public int getTime(){
 return timings;
 }
 public void setWebsite(String websiteDetails){
this.websiteDetails=websiteDetails;
}
public String getWebsite(){
 return websiteDetails;
 }
 public static void main(String args[]){
 Bank1 bank1 = new Bank1();
 bank1.setBankId(65);
 bank1.setBankName("CANARA");
 bank1.setBranch("chilur");
 bank1.setBranchCode(4563);
 bank1.setAddress("Main Street");
 bank1.setHelplineNo(7899186879L);
 bank1.setBankManager("RAVI Kumar");
 bank1.setBankCode("IFSC6072");
 bank1.setMisc("MISC0000");
 bank1.setLockers(100);
 bank1.setEmployee(12);
 bank1.setTime(12);
 bank1.setWebsite("www.Canara.com");
 System.out.println(bank1.bankId+"  "+bank1.bankName+" "+bank1.branch+" "+bank1.branchCode+" "+bank1.address+" "+bank1.helplineNo+" "+bank1.branchManager+" "+
 bank1.ifscCode+" "+bank1.miscCode+" "+bank1.noofLockers+" "+bank1.noofEmployees+" "+bank1.websiteDetails);
 }
 }
 