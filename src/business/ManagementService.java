package business;

import business.entities.*;
import persistence.DataAccessObject;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;


public class ManagementService {

    private final DataAccessObject dataAccessObject;

    public ManagementService(DataAccessObject dataAccessObject) {
        this.dataAccessObject = dataAccessObject;
    }

    public List<Customer> getCustomers() {
        List<Customer> customers = dataAccessObject.loadAllCustomers();
        return customers;
    }

    public List<Reservation> getReservations() {
        List<Reservation> reservations = dataAccessObject.loadAllReservations();
        return reservations;
    }

    public List<Room> getRooms() {
        List<Room> rooms = dataAccessObject.loadAllRooms();
        return rooms;
    }

    public List<Payment> getPayments() {
        List<Payment> payments = dataAccessObject.loadAllPayments();
        return payments;
    }

    public void addNewReservation(Reservation newReservation) {
        List<Reservation> reservations = dataAccessObject.loadAllReservations();
        reservations.add(newReservation);
        dataAccessObject.saveAllReservations(reservations);
    }

    public void removeExistingReservation(int reservationId) {
        List<Reservation> reservations = dataAccessObject.loadAllReservations();
        int index = getReservationIndex(reservations, reservationId);
        if (index != -1) { //if found
            reservations.remove(index);
            dataAccessObject.saveAllReservations(reservations);
        }
    }

    private int getReservationIndex(List<Reservation> reservations, int reservationId) {
        for (int currentIndex = 0; currentIndex < reservations.size(); currentIndex++) {
            Reservation currentReservation = reservations.get(currentIndex);
            if (currentReservation.getReservationId() == reservationId) {
                return currentIndex;
            }
        }
        return -1;
    }

    private int getCustomerIndexByReservationId(List<Customer> customers, int reservationId) {
        for (int currentIndex = 0; currentIndex < customers.size(); currentIndex++) {
            Customer currentCustomer = customers.get(currentIndex);
            if (currentCustomer.getReservationId() == reservationId) {
                return currentIndex;
            }
        }
        return -1;
    }

    private int getCustomerIndex(List<Customer> customers, int customerId) {
        for (int currentIndex = 0; currentIndex < customers.size(); currentIndex++) {
            Customer currentCustomer = customers.get(currentIndex);
            if (currentCustomer.getCustomerId() == customerId) {
                return currentIndex;
            }
        }
        return -1;
    }

    private int getRoomIndex(List<Room> rooms, int roomId) {
        for (int currentIndex = 0; currentIndex < rooms.size(); currentIndex++) {
            Room currentRoom = rooms.get(currentIndex);
            if (currentRoom.getRoomId() == roomId) {
                return currentIndex;
            }
        }
        return -1;
    }

    private int getPaymentIndexByCustomerId(List<Payment> payments, int customerId) {
        for (int currentIndex = 0; currentIndex < payments.size(); currentIndex++) {
            Payment currentPayment = payments.get(currentIndex);
            if (currentPayment.getCustomerId() == customerId) {
                return currentIndex;
            }
        }
        return -1;
    }

    public List<Hotel> getHotels() {
        List<Hotel> hotels = dataAccessObject.loadAllHotels();
        return hotels;
    }

    public Room updateRoomPrice(int roomId, double newPrice) {
        List<Room> rooms = dataAccessObject.loadAllRooms();
        int indexRoom = getRoomIndex(rooms, roomId);
        Room currentRoom = rooms.get(indexRoom);
        currentRoom.setPrice(newPrice);
        dataAccessObject.saveAllRooms(rooms);

        return currentRoom;

    }

    public Reservation updateExistingReservationCheckInDate(int reservationId, LocalDate newDate) {
        List<Reservation> reservations = dataAccessObject.loadAllReservations();
        int indexReservation = getReservationIndex(reservations, reservationId);
        Reservation currentReservation = reservations.get(indexReservation);
        currentReservation.setDateOfCheckIn(newDate);
        dataAccessObject.saveAllReservations(reservations);

        return currentReservation;
    }


    public HashMap<Reservation, Customer> getCustomerByReservationId(int reservationId) {
        HashMap<Reservation, Customer> customerByReservationId = new HashMap<>();

        List<Reservation> reservations = dataAccessObject.loadAllReservations();
        List<Customer> customers = dataAccessObject.loadAllCustomers();

        int indexReservation = getReservationIndex(reservations, reservationId);
        int indexCustomer = getCustomerIndexByReservationId(customers, reservationId);

        Reservation currentReservation = reservations.get(indexReservation);
        Customer currentCustomer = customers.get(indexCustomer);

        if (currentCustomer.getReservationId() == currentReservation.getReservationId()) {
            customerByReservationId.put(currentReservation, currentCustomer);
            return customerByReservationId;
        }
        return null;
    }

    public HashMap<Customer, Payment> getPaymentByCustomerId(int customerId) {
        HashMap<Customer, Payment> paymentByCustomerId = new HashMap<>();

        List<Customer> customers = dataAccessObject.loadAllCustomers();
        List<Payment> payments = dataAccessObject.loadAllPayments();

        int indexCustomer = getCustomerIndex(customers, customerId);
        int indexPayment = getPaymentIndexByCustomerId(payments, customerId);

        Customer currentCustomer = customers.get(indexCustomer);
        Payment currentPayment = payments.get(indexPayment);

        if (currentPayment.getCustomerId() == currentCustomer.getCustomerId()) {
            paymentByCustomerId.put(currentCustomer, currentPayment);
            return paymentByCustomerId;
        }
        return null;
    }
}

