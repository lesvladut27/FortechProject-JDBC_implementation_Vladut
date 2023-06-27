package business.comparators;

import business.entities.Hotel;

import java.util.Comparator;

public class HotelComparator  implements Comparator <Hotel> {

    public int compare (Hotel firstHotel, Hotel secondHotel) {

        return firstHotel.getName().compareTo(secondHotel.getName());
    }
}
