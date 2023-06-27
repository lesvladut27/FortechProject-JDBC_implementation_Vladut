package business.comparators;

import business.entities.Customer;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {

    public int compare(Customer firstCustomer, Customer secondCustomer) {
        if (firstCustomer.getFirstName().equals(secondCustomer.getFirstName())) {
            return firstCustomer.getLastName().compareTo(secondCustomer.getLastName());
        } else {
            return firstCustomer.getFirstName().compareTo(secondCustomer.getFirstName());
        }
    }
}



