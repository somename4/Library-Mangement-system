package app;

import managers.ReaderManager;

public class LibraryApp {
    
    public static void main(String[] args) {
        try {
            ReaderManager rm = new ReaderManager();
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        System.out.println(ReaderManager.TEST);
    }
}
