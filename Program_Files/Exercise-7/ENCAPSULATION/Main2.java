class Ticket {
    private boolean isBooked;

    public void bookTicket() {
        if (!isBooked) isBooked = true;
        else System.out.println("Already booked!");
    }

    public boolean isBooked() { return isBooked; }
}

public class Main2 {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        t.bookTicket();
        System.out.println("Is Booked: " + t.isBooked());
    }
}
