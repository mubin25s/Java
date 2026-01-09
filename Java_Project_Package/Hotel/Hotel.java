package Hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Room> rooms;

    public Hotel(int numRooms) {
        rooms = new ArrayList<>();
        for (int i = 1; i <= numRooms; i++) {
            rooms.add(new Room(i));
        }
    }

    public void bookRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                if (room.book()) {
                    System.out.println("Room " + roomNumber + " booked.");
                } else {
                    System.out.println("Room " + roomNumber + " is already occupied.");
                }
                return;
            }
        }
        System.out.println("Room not found.");
    }
}
