class KarnatakaTest{
public static void main(String args[]){
	Karnataka.cityNames("Mandya");
	Karnataka.cityNames("shivamogga");
	Karnataka.cityNames("raichur");
	Karnataka.cityNames("davanagere");
	Karnataka.cityNames("bengaluru");
	Karnataka.cityNames("kolar");
	Karnataka.cityNames("koppal");
	Karnataka.cityNames("mysore");
	Karnataka.cityNames("hubbali");
	Karnataka.cityNames("tumkur");
	Karnataka.cityNames("udupi");
	
Karnataka.getIdentify();
String cityName= Karnataka.searchStateCityByName("mysore");
System.out.println(cityName);
boolean isUpdated=Karnataka.updateCityName("kolar","Sagara");
System.out.println("The upadated city is added" + isUpdated);
Karnataka.getIdentify();

int newLength =Karnataka.deletecityName("tumkur");
System.out.println("calling getAlldeliciousPostDeleteName");
Karnataka.getAllcityPostDeleteName(newLength);
}
}