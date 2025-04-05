
class TrainTicket {
    private boolean isReserved;

    public void reserveTicket() {
        if (!isReserved) isReserved = true;
        else System.out.println("Already reserved!");
    }

    public boolean isReserved() { return isReserved; }
}

public class Main4 {
    public static void main(String[] args) {
        TrainTicket t = new TrainTicket();
        t.reserveTicket();
        System.out.println("Reserved: " + t.isReserved());
    }
}
