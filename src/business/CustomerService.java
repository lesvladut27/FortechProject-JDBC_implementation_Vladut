package business;

import business.entities.Customer;
import persistence.CustomerDao;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerService {

    private CustomerDao customerDao;

    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public List<Customer> getAllCustomers() {
        List<Customer> list = customerDao.getAllCustomers();
        return list.stream().sorted().collect(Collectors.toList());
    }


}
