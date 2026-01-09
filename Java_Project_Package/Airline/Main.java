package Airline;

public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight("AA123", 2);
        System.out.println("Booking seat 1: " + flight.bookSeat());
        System.out.println("Booking seat 2: " + flight.bookSeat());
        System.out.println("Booking seat 3: " + flight.bookSeat());
    }
}
