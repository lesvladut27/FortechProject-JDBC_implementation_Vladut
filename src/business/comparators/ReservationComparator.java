package business.comparators;

import business.entities.Reservation;

import java.util.Comparator;

public class ReservationComparator implements Comparator<Reservation> {
    @Override
    public int compare(Reservation firstReservation, Reservation secondReservation) {
        if (firstReservation.getNumberOfPersons() < secondReservation.getNumberOfPersons()) {
            return -1;
        }
        if (firstReservation.getNumberOfPersons() == secondReservation.getNumberOfPersons()) {
            int ri1 = firstReservation.getReservationId();
            int ri2 = secondReservation.getReservationId();
            return Integer.compare(ri1, ri2);
        }
        return 1;
    }
}
