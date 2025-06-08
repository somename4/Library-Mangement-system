package interfaces;

import java.util.List;

public interface EntityIntiator<T> {
    public static final String COMMA_DELIMITER = ";";
    
    public List<T> initiateEntity(List<String> rawData);
}
