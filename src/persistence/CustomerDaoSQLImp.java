package persistence;

import business.CustomerService;
import business.entities.Customer;
import util.DBUtil;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerDaoSQLImp implements CustomerDao {

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> customer = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            connection = DBUtil.getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery("select * from customer");
            while (rs.next()) {
                int id = rs.getInt("id");
                String first_name = rs.getString(2);
                String last_name = rs.getString(3);
                LocalDate date_of_birth = rs.getDate(4).toLocalDate();
                String phone_number = rs.getString(5);
                String email = rs.getString("email");
                int reservation_id = rs.getInt(7);

                Customer customer1 = new Customer(id, first_name, last_name, date_of_birth, phone_number, email, reservation_id);
                customer.add(customer1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DBUtil.closeConnection(connection);
        }
        return customer;

    }

}

