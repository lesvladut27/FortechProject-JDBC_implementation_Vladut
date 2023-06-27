package business.entities;
import java.time.LocalDate;
import java.util.Objects;

public class Reservation {

    private int reservationId;
    private LocalDate dateOfReservation;

    private LocalDate dateOfCheckIn;

    private LocalDate dateOfCheckOut;

    private int numberOfPersons;

    private int roomId;

    public Reservation(int reservationId, LocalDate dateOfReservation, LocalDate dateOfCheckIn, LocalDate dateOfCheckOut, int numberOfPersons, int roomId) {
        this.reservationId = reservationId;
        this.dateOfReservation = dateOfReservation;
        this.dateOfCheckIn = dateOfCheckIn;
        this.dateOfCheckOut = dateOfCheckOut;
        this.numberOfPersons = numberOfPersons;
        this.roomId = roomId;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public LocalDate getDateOfReservation() {
        return dateOfReservation;
    }

    public void setDateOfReservation(LocalDate dateOfReservation) {
        this.dateOfReservation = dateOfReservation;
    }

    public LocalDate getDateOfCheckIn() {
        return dateOfCheckIn;
    }

    public void setDateOfCheckIn(LocalDate dateOfCheckIn) {
        this.dateOfCheckIn = dateOfCheckIn;
    }

    public LocalDate getDateOfCheckOut() {
        return dateOfCheckOut;
    }

    public void setDateOfCheckOut(LocalDate dateOfCheckOut) {
        this.dateOfCheckOut = dateOfCheckOut;
    }

    public int getNumberOfPersons() {
        return numberOfPersons;
    }

    public void setNumberOfPersons(int numberOfPersons) {
        this.numberOfPersons = numberOfPersons;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return numberOfPersons == that.numberOfPersons && roomId == that.roomId && Objects.equals(reservationId, that.reservationId) && Objects.equals(dateOfReservation, that.dateOfReservation) && Objects.equals(dateOfCheckIn, that.dateOfCheckIn) && Objects.equals(dateOfCheckOut, that.dateOfCheckOut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reservationId, dateOfReservation, dateOfCheckIn, dateOfCheckOut, numberOfPersons, roomId);
    }

    @Override
    public String toString() {
        return "Reservation = {" +
                "reservationId='" + reservationId + '\'' +
                ", dateOfReservation=" + dateOfReservation +
                ", dateOfCheckIn=" + dateOfCheckIn +
                ", dateOfCheckOut=" + dateOfCheckOut +
                ", numberOfPersons=" + numberOfPersons +
                ", roomId=" + roomId +
                '}';
    }
}


