package services;

import java.util.List;

import entities.Customer;
import interfaces.EntityInfoPrinter;

public class CustomerInfoPrintert implements EntityInfoPrinter<Customer>{

    @Override
    public void printEntityInfo(Customer customer) {
        System.out.println(customer.getId() + SPACE_STRING + customer.getFirstName() + SPACE_STRING +customer.getName() +
        SPACE_STRING + Boolean.toString(customer.isFeesPayed()) + SPACE_STRING + customer.getZipCode()
        + SPACE_STRING + customer.getCity() + customer.getAdress() );
    }
    

    public void printMultipleCustomer(List<Customer> customers){
        for(Customer customer : customers){
            printEntityInfo(customer);
        }
    }

}
