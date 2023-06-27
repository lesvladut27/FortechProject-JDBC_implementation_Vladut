package business.comparators;

import business.entities.Room;

import java.util.Comparator;

public class RoomComparator implements Comparator<Room> {
    public int compare(Room firstRoom, Room secondRoom) {
        if (firstRoom.getPrice() < secondRoom.getPrice()) {
            return -1;
        }
        if (firstRoom.getPrice() == secondRoom.getPrice()) {
            return firstRoom.getNumberOfRoom().compareTo(secondRoom.getNumberOfRoom());
        }
        return 1;
    }

}
