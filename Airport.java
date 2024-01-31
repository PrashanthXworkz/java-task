public class Airport {
    private int airportId;
    private String airportName;
    private String city;
    private String country;
    private String airportCode;
    private long contactNumber;
    private String airportManager;
    private String runwayType;
    private int numOfTerminals;
    private String website;

    public void setAirportId(int airportId) {
        this.airportId = airportId;
    }

    public int getAirportId() {
        return airportId;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setAirportManager(String airportManager) {
        this.airportManager = airportManager;
    }

    public String getAirportManager() {
        return airportManager;
    }

    public void setRunwayType(String runwayType) {
        this.runwayType = runwayType;
    }

    public String getRunwayType() {
        return runwayType;
    }

    public void setNumOfTerminals(int numOfTerminals) {
        this.numOfTerminals = numOfTerminals;
    }

    public int getNumOfTerminals() {
        return numOfTerminals;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getWebsite() {
        return website;
    }

    public static void main(String args[]) {
        Airport airport = new Airport();
        airport.setAirportId(101);
        airport.setAirportName("John F. Kennedy International Airport");
        airport.setCity("New York");
        airport.setCountry("United States");
        airport.setAirportCode("JFK");
        airport.setContactNumber(1234567890L);
        airport.setAirportManager("Michael Smith");
        airport.setRunwayType("Concrete");
        airport.setNumOfTerminals(6);
        airport.setWebsite("www.jfkairport.com");

        System.out.println(airport.airportId + " " + airport.airportName + " " + airport.city + " " + airport.country + " "
                + airport.airportCode + " " + airport.contactNumber + " " + airport.airportManager + " " + airport.runwayType
                + " " + airport.numOfTerminals + " " + airport.website);
    }
}
