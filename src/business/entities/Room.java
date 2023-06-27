package business.entities;

import java.util.Objects;

public class Room {
    private int roomId;
    private String numberOfRoom;
    private String type;
    private int capacity;
    private double price;
    private String status;
    private int hotelId;

    public Room(int roomId, String numberOfRoom, String type, int capacity, double price, String status, int hotelId) {
        this.roomId = roomId;
        this.numberOfRoom = numberOfRoom;
        this.type = type;
        this.capacity = capacity;
        this.price = price;
        this.status = status;
        this.hotelId = hotelId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(String numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return roomId == room.roomId && capacity == room.capacity && Double.compare(room.price, price) == 0 && hotelId == room.hotelId && Objects.equals(numberOfRoom, room.numberOfRoom) && Objects.equals(type, room.type) && Objects.equals(status, room.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomId, numberOfRoom, type, capacity, price, status, hotelId);
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", numberOfRoom='" + numberOfRoom + '\'' +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                ", status='" + status + '\'' +
                ", hotelId=" + hotelId +
                '}';
    }
}


