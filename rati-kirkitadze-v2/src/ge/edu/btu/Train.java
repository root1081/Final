package ge.edu.btu;
import java.util.List;
import java.util.ArrayList;

public class Train {
    public List<Passenger> passengerList = new ArrayList<>();

    public List<Passenger> getPassengerList() {
        return passengerList;
    }
    public boolean addPassenger(Passenger passenger) {
        boolean ticket = false;

        if (passenger.hasTicket()) {
            ticket = passengerList.add(passenger);
        } return ticket;
    }
}
