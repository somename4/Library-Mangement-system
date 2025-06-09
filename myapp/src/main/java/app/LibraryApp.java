package app;

import entities.Book;
import entities.BookCopy;
import entities.Customer;
import services.BookCopyInitiator;
import services.BookIntiator;
import services.CustomerInitiator;

public class LibraryApp {
    
    public static void main(String[] args) {
        CustomerInitiator ci = new CustomerInitiator();
        BookIntiator bi = new BookIntiator();
        BookCopyInitiator bci = new BookCopyInitiator();
        for (Customer customer : CustomerInitiator.CUSTOMERS) {
            customer.printCostumersInfo();
        }
        for (Book book : BookIntiator.BOOKS) {
            book.printBookInfo();
        }
        for (BookCopy bookcopy : BookCopyInitiator.BOOKCOPIES) {
            bookcopy.printBookCopyInfo();
        }
    
    }
}
