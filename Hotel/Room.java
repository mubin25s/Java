package Hotel;

public class Room {
    private int roomNumber;
    private boolean isOccupied;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isOccupied = false;
    }

    public boolean book() {
        if (!isOccupied) {
            isOccupied = true;
            return true;
        }
        return false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
