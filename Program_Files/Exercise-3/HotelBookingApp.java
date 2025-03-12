import java.util.ArrayList;

class Room {
    int roomNumber;
    boolean isBooked;

    Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isBooked = false;
    }

    void bookRoom() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Room " + roomNumber + " booked successfully.");
        } else {
            System.out.println("Room " + roomNumber + " is already booked.");
        }
    }

    void displayRoomInfo() {
        System.out.println("Room " + roomNumber + " - " + (isBooked ? "Booked" : "Available"));
    }
}

class Guest {
    String name;
    int guestId;

    Guest(String name, int guestId) {
        this.name = name;
        this.guestId = guestId;
    }

    void displayGuestInfo() {
        System.out.println("Guest: " + name + ", ID: " + guestId);
    }
}

public class HotelBookingApp {
    public static void main(String[] args) {
        Room room1 = new Room(101);
        Room room2 = new Room(102);

        Guest guest1 = new Guest("Alice Johnson", 1);

        guest1.displayGuestInfo();
        room1.displayRoomInfo();
        room1.bookRoom();
        room1.displayRoomInfo();
    }
}
