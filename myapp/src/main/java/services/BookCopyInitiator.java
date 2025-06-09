package services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.BookCopy;
import interfaces.EntityIntiator;

public class BookCopyInitiator implements EntityIntiator<BookCopy>{


    public static List<BookCopy> BOOKCOPIES = new ArrayList<>();
    private final String path= "myapp\\src\\main\\resources\\bookcopies.csv";

    

    public BookCopyInitiator() {
        try {
           initiateEntity(ReaderManager.readData(path));
        } catch (Exception e) {
            e.printStackTrace();
        }         
    }

    @Override
    public List<BookCopy> initiateEntity(List<String> rawData) {

        String[] arr;
        for(int i = 1; i<rawData.size();i++){
            
            arr = ((String) rawData.get(i)).split(COMMA_DELIMITER);
            BOOKCOPIES.add(new BookCopy(Long.parseLong(arr[0]), arr[1], arr[2], LocalDate.parse(arr[3]), Boolean.parseBoolean(arr[4]), LocalDate.parse(arr[5])));

        }       
        return BOOKCOPIES;
    }
    
}
