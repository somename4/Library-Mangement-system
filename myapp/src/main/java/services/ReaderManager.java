package services;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ReaderManager {
    
    
    
    

    public ReaderManager() throws FileNotFoundException, IOException{
    }

    /**
     * @param path
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static List<String> readData(String path) throws FileNotFoundException, IOException{

        List<String> rawData = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                rawData.add(line);
            }
        }

        return rawData;
    }






    
}