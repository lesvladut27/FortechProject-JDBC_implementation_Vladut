package business.entities;

import java.util.Objects;

public class Hotel {

    private int hotelId;
    private String name;

    private String address;

    private String phoneNumber;

    private String services;

    public Hotel(int hotelId, String name, String address, String phoneNumber, String services) {

        this.hotelId = hotelId;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.services = services;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(hotelId, hotel.hotelId) && Objects.equals(name, hotel.name) && Objects.equals(address, hotel.address) && Objects.equals(phoneNumber, hotel.phoneNumber) && Objects.equals(services, hotel.services);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hotelId, name, address, phoneNumber, services);
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelId=" + hotelId + '\'' +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", services='" + services + '\'' +
                '}';
    }
}


