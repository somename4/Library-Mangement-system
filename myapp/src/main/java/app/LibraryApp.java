package app;

import services.CustomerInfoPrintert;
import services.CustomerInitiator;

public class LibraryApp {
    
    public static void main(String[] args) {
        CustomerInitiator ci = new CustomerInitiator();
        CustomerInfoPrintert cp = new CustomerInfoPrintert();
        cp.printMultipleCustomer(CustomerInitiator.CUSTOMERS);        

/*         CustomerInitiator ci = new CustomerInitiator();
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
        } */
    
    }
}
