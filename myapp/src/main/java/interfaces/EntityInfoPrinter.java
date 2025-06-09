package interfaces;

public interface EntityInfoPrinter<T> {
    
    public static final String SPACE_STRING = "\t | \t";

    public void printEntityInfo(T t);

}
