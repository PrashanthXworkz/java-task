class Hospital{
private int patientId;
private String patientName;
private int age;
private String bloodGroup;
private String gender;
private double fees;

 public void setPatientId(int  patientId){
	this.patientId=patientId;
}
public int  getPatientId(){
	return patientId;
}
public void setFees(double fees){
this.fees=fees;
}
public  double getFees(){
return fees;
}
public static void main(String args[]){
Hospital hosp=new Hospital();
hosp.setFees(60.00);
hosp.setPatientId(67);
System.out.println(hosp.fees+"   "+hosp.patientId);
}
}
