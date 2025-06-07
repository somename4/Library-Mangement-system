package managers;

import entities.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ReaderManager {
    public static List<Customer> CUSTOMERS = new ArrayList<Customer>();
    public static List<Book> BOOKS = new ArrayList<Book>();
    public static List<BookCopy> BOOKCOPIES = new ArrayList<BookCopy>();

    public static List<List<String>> TEST = new ArrayList<>();

    public static final String COMMA_DELIMITER = ";";


    public ReaderManager() throws FileNotFoundException, IOException{
        intiateCustomers();
    }

    /**
     * @param path
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void intiateCustomers() throws FileNotFoundException, IOException{
        try (BufferedReader br = new BufferedReader(new FileReader("myapp\\src\\main\\resources\\customers.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
            String[] values = line.split(COMMA_DELIMITER);
            TEST.add(Arrays.asList(values));
            }
        }
    }






    
}