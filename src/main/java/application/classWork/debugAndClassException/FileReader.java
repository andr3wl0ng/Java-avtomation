package application.classWork.debugAndClassException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.SortedMap;

/**
public class FileReader {
    public static void main(String[] args) {


        try {
            BufferedReader reader = new BufferedReader(
                    new java.io.FileReader("C:\\Users\\Andrew\\Download\\test.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println("line");
            }
            reader.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
 */

public class FileReader {
    public static void main(String[] args) {


        try {
            BufferedReader reader = new BufferedReader(
                    new java.io.FileReader("C:\\Users\\Andrew\\Downloads\\test.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println("line");
            }
            reader.close();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            System.out.println("выполнится в любом случее");
        }
    }
}
