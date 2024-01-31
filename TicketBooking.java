public class TicketBooking {
    private int bookingId;
    private String passengerName;
    private String source;
    private String destination;
    private String airline;
    private String flightNumber;
    private String departureTime;
    private String arrivalTime;
    private int seatNumber;
    private double ticketPrice;

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getAirline() {
        return airline;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public static void main(String args[]) {
        TicketBooking ticket = new TicketBooking();
        ticket.setBookingId(101);
        ticket.setPassengerName("John Doe");
        ticket.setSource("New York");
        ticket.setDestination("London");
        ticket.setAirline("British Airways");
        ticket.setFlightNumber("BA101");
        ticket.setDepartureTime("2023-07-25 10:30");
        ticket.setArrivalTime("2023-07-25 16:45");
        ticket.setSeatNumber(12);
        ticket.setTicketPrice(1500.50);

        System.out.println(ticket.bookingId + " " + ticket.passengerName + " " + ticket.source + " " + ticket.destination
                + " " + ticket.airline + " " + ticket.flightNumber + " " + ticket.departureTime + " " + ticket.arrivalTime
                + " " + ticket.seatNumber + " " + ticket.ticketPrice);
    }
}
