package application.classWork.debugAndClassException;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class PalindromWriteRead {
    public static void main(String[] args) {
        try {
            BufferedReader palindrom = new BufferedReader(new FileReader("C:\\Users\\Andrew\\Desktop\\oloolo.txt"));
            String line = palindrom.readLine();
            palindrom.close();

                int n = line.length();
                for (int i = 0; i < (n/2); ++i) {
                    if (line.charAt(i) == line.charAt(line.length()-i-1)) {
                        trueWriter(line);
                    } else {
                        falseWriter(line);
                    }
                }
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    private static void falseWriter(String line) throws IOException {
        BufferedWriter writer = new BufferedWriter(new java.io.FileWriter("C:\\Users\\Andrew\\Desktop\\oloolo-false.txt"));
        writer.append(line+" false"+ "||" + new Date().toString());
        writer.close();
        System.out.println("Was false");
    }

    private static void trueWriter(String line) throws IOException {
        BufferedWriter writer = new BufferedWriter(new java.io.FileWriter("C:\\Users\\Andrew\\Desktop\\oloolo-true.txt"));
        writer.append(line+" true" + "||" + new Date().toString());
        writer.close();
        System.out.println("Was true");
    }
}
