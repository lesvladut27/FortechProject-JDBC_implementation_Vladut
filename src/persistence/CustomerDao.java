package persistence;

import business.entities.Customer;

import java.util.List;

public interface CustomerDao {

    List<Customer> getAllCustomers();


}
