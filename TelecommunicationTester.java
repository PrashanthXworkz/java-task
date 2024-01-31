class TelecommunicationTester{
public static void main(String args[]){
	Telecommunication.simName("Reliance Jio");
Telecommunication.simName("Airtel");
	Telecommunication.simName("vodafone");
	Telecommunication.simName("BSNL");
	Telecommunication.simName("MTNL");

Telecommunication.getNetwork();
boolean isUpdated=Telecommunication.updateSimName("BSNL","Idea");
System.out.println("The upadated sim is added" + isUpdated);
Telecommunication.getNetwork();

int newLength =Telecommunication.deletesimName("BSNL");
System.out.println("calling getAlldeliciousPostDeleteName");
Telecommunication.getAllsimPostDeleteName(newLength);
}
}