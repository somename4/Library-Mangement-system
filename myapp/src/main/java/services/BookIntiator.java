package services;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entities.Book;
import interfaces.EntityIntiator;

public class BookIntiator implements EntityIntiator<Book>{



    public static List<Book> BOOKS = new ArrayList<>();
    private final String path= "myapp\\src\\main\\resources\\books.csv";

    public BookIntiator(){
        try {
           initiateEntity(ReaderManager.readData(path));
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }    

    @Override
    public List<Book> initiateEntity(List<String> rawData) {
        String[] arr;

        for(int i = 1; i<rawData.size();i++){
            
            arr = ((String) rawData.get(i)).split(COMMA_DELIMITER);
            BOOKS.add(new Book(arr[0], arr[1], Arrays.asList(arr[2].split(",")), Year.of(Integer.parseInt(arr[3])), arr[4], arr[5], Integer.parseInt(arr[6])));

            
        }

        return BOOKS;
    }
    
}
