class Airlane {
 String airlineName;
 String flightNumber;
 String source;
 String destination;
 int totalSeats;
 int availableSeats;
 double ticketPrice;
 String departureTime;
 String arrivalTime;
 boolean isInternational;

 public Airlane() {
  this("Unknown Airline", "N/A");
 }


 public Airlane(String airlineName, String flightNumber) {
  this(airlineName, flightNumber, "Unknown", "Unknown", 100);
 }


 public Airlane(String airlineName, String flightNumber, String source, String destination, int totalSeats) {
  this(airlineName, flightNumber, source, destination, totalSeats, totalSeats, 5000.0);
 }


 public Airlane(String airlineName, String flightNumber, String source, String destination, int totalSeats, int availableSeats, double ticketPrice) {
  this(airlineName, flightNumber, source, destination, totalSeats, availableSeats, ticketPrice, "10:00 AM", "02:00 PM", false);
 }


 public Airlane(String airlineName, String flightNumber, String source, String destination, int totalSeats, int availableSeats, double ticketPrice, String departureTime, String arrivalTime, boolean isInternational) {
  this.airlineName = airlineName;
  this.flightNumber = flightNumber;
  this.source = source;
  this.destination = destination;
  this.totalSeats = totalSeats;
  this.availableSeats = availableSeats;
  this.ticketPrice = ticketPrice;
  this.departureTime = departureTime;
  this.arrivalTime = arrivalTime;
  this.isInternational = isInternational;
 }


 public void displayDetails() {
  System.out.println("Airline: " + airlineName);
  System.out.println("Flight Number: " + flightNumber);
  System.out.println("Source: " + source);
  System.out.println("Destination: " + destination);
  System.out.println("Total Seats: " + totalSeats);
  System.out.println("Available Seats: " + availableSeats);
  System.out.println("Ticket Price: " + ticketPrice);
  System.out.println("Departure Time: " + departureTime);
  System.out.println("Arrival Time: " + arrivalTime);
  System.out.println("International Flight: " + (isInternational ? "Yes" : "No"));
 }

 public static void main(String[] args) {
  Airlane flight1 = new Airlane();
  flight1.displayDetails();

  Airlane flight2 = new Airlane("Sky Airlines", "SK123", "New York", "London", 250, 50, 1200.0, "8:00 AM", "4:00 PM", true);
  flight2.displayDetails();
 }
}
