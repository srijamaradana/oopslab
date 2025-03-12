import java.util.ArrayList;

class Flight {
    String flightNumber;
    String destination;

    Flight(String flightNumber, String destination) {
        this.flightNumber = flightNumber;
        this.destination = destination;
    }

    void displayFlightDetails() {
        System.out.println("Flight: " + flightNumber + " to " + destination);
    }
}

class Passenger {
    String name;
    int age;

    Passenger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPassengerInfo() {
        System.out.println("Passenger: " + name + ", Age: " + age);
    }
}

class Ticket {
    Flight flight;
    Passenger passenger;

    Ticket(Flight flight, Passenger passenger) {
        this.flight = flight;
        this.passenger = passenger;
    }

    void displayTicketDetails() {
        flight.displayFlightDetails();
        passenger.displayPassengerInfo();
    }
}

public class AirlineReservationApp {
    public static void main(String[] args) {
        Flight flight = new Flight("AI123", "New York");
        Passenger passenger = new Passenger("John Smith", 30);

        Ticket ticket = new Ticket(flight, passenger);
        ticket.displayTicketDetails();
    }
}
