import business.CustomerService;
import business.ManagementService;
import persistence.CustomerDaoSQLImp;
import persistence.DataAccessObject;
import presentation.UserInterface;

public class Main {
    public static void main(String[] args) {


        DataAccessObject dataAccessObject = new DataAccessObject();
        ManagementService managementService = new ManagementService(dataAccessObject);
        UserInterface userInterface = new UserInterface(managementService);

        userInterface.printGreetingMessage();
        userInterface.showMainMenu();

        CustomerService customerService = new CustomerService(new CustomerDaoSQLImp());
        customerService.getAllCustomers();
    }

}