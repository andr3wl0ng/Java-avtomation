package application.classWork.debugAndClassException;

import java.io.*;

public class FileWriter {
    public static void main(String[] args) {

        try {

            String firstString = "string first";
            String secondString = "string first";

            BufferedWriter writer = new BufferedWriter(new java.io.FileWriter("C:\\Users\\Andrew\\Desktop\\lessonWriterEasy.txt", true));

            writer.append(firstString);
            writer.newLine();
            writer.append(secondString);
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}


/**
 * try {
 * String firstLine = "This is first line";
 * String secondLine = "Second line is here";
 * <p>
 * BufferedWriter writer = new BufferedWriter(new OutputStreamWriter
 * (new FileOutputStream("C:\\Users\\Andrew\\Desktop\\lessonWriter.txt")));
 * writer.append(firstLine);
 * writer.newLine();
 * writer.append(secondLine);
 * writer.close();
 * } catch (IOException e){
 * e.printStackTrace();
 * }
 * }
 * }
 **/