package services;

import java.util.ArrayList;
import java.util.List;

import entities.Customer;
import interfaces.EntityIntiator;

public class CustomerInitiator implements EntityIntiator<Customer>{

    private final String path= "myapp\\src\\main\\resources\\customers.csv";
    public static List<Customer> CUSTOMERS = new ArrayList<>();

    public CustomerInitiator(){
        try {
           initiateEntity(ReaderManager.readData(path));
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }

    @Override
    public List<Customer> initiateEntity(List<String> rawData) {
        String[] arr;
        for(int i = 1; i<rawData.size();i++){
            
            arr = ((String) rawData.get(i)).split(COMMA_DELIMITER);

            CUSTOMERS.add(new Customer(Integer.parseInt(arr[0]), arr[1],arr[2],arr[3],arr[4],arr[5],Boolean.parseBoolean(arr[6])));
            
        }
        return CUSTOMERS;
        
    }
    
}
