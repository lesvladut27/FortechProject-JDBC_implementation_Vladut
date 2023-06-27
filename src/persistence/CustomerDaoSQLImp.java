package persistence;

import business.entities.Customer;
import util.DBUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoSQLImp implements CustomerDao{

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        Connection connection= null;
        Statement statement = null;
        ResultSet rs = null
        try {
            connection = DBUtil.getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery("select * from customers");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString(2);
                String date_of_birth = rs.getDate(3);
                String phone_number = rs.getString(4);
                String email = rs.getString("email");
                String reservation_id = rs.getInt(6);

                Customer customer = new Customer(id, name, date_of_birth, phone_number,email,reservation_id);
                customer.add(customer);
                }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DBUtil.closeConnection(connection);
        }
        return customers;

    }
}
