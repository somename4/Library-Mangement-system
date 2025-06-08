package app;

import entities.Customer;
import services.CustomerInitiator;
import services.ReaderManager;

public class LibraryApp {
    
    public static void main(String[] args) {
        CustomerInitiator ci = new CustomerInitiator();
        for (Customer customer : CustomerInitiator.CUSTOMERS) {
            customer.printCostumersInfo();
        }
    
    }
}
