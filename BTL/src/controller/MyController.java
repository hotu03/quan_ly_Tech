package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class MyController implements controller{

    @Override
    public <T> void writeToFile(List<T> list, String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public <T> List<T> readDataFromFile(String fileName) {
        List<T> list = new ArrayList<>();
        File file = new File(fileName);
        if (file.length() > 0) {
            try {
                file.createNewFile();
                FileInputStream fos = new FileInputStream(file);
                ObjectInputStream oos = new ObjectInputStream(fos);
                Object o = oos.readObject();
                list = (List<T>) o;
                oos.close();
                fos.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
          }
            return list;
    }
    
    @Override
    public void writeAccoutToFile(String accout, String fileName){
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(accout);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public String readAccountFromFile(String fileName){
        FileReader inFileReader;
        BufferedReader in;
        String accout = "";
        try{
            inFileReader = new FileReader(fileName);
            in = new BufferedReader(inFileReader);
            accout = in.readLine();
            in.close();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        return accout;
    }
}
