package OOPS.Interfaces;

public class BookingApplication {

}

interface FlightOperations {
    void getAllAvailableFlights();

    void booking(BookingApplication bookingObj);
}

class BritishAirways implements FlightOperations {

    public void getAllAvailableFlights() {
        //get british airways flights in the way
        //they told us to fetch flight details.
    }

    public void booking(BookingApplication flightDetails) {
        //place booking order in a way British airways
        //told us to place order for seat.
    }
}

class Emirates implements FlightOperations {

    public void getAllAvailableFlights() {
        //get Emirates flights in the way
        //they told us to fetch flight details.
    }

    public void booking(BookingApplication flightDetails) {
        //place booking order in a way Emirates airways
        //told us to place order for seat.
    }
}
