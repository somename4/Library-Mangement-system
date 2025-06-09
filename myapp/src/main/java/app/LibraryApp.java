package app;

import entities.Book;
import entities.Customer;
import services.BookIntiator;
import services.CustomerInitiator;

public class LibraryApp {
    
    public static void main(String[] args) {
        CustomerInitiator ci = new CustomerInitiator();
        BookIntiator bi = new BookIntiator();
        for (Customer customer : CustomerInitiator.CUSTOMERS) {
            customer.printCostumersInfo();
        }
        for (Book book : BookIntiator.BOOKS) {
            book.printBookInfo();
        }
    
    }
}
