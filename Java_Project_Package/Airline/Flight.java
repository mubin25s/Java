package Airline;

public class Flight {
    private String flightNumber;
    private int capacity;
    private int bookedSeats;

    public Flight(String flightNumber, int capacity) {
        this.flightNumber = flightNumber;
        this.capacity = capacity;
        this.bookedSeats = 0;
    }

    public boolean bookSeat() {
        if (bookedSeats < capacity) {
            bookedSeats++;
            return true;
        }
        return false;
    }

    public String getFlightNumber() {
        return flightNumber;
    }
}
