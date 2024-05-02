
package controller;
import java.util.List;
/**
 *
 * @author Dell
 */
public interface controller {
     <T> void writeToFile(List<T> list, String fileName);

    <T> List<T> readDataFromFile(String fileName);
    
    void writeAccoutToFile(String accout, String fileName);
    String readAccountFromFile(String fileName);
    
}
