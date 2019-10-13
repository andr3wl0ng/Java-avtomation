package application.classWork;

import java.util.Arrays;
import java.util.Random;

public class ClassWork6 {
    public static void main(String[] args) {

        char[] array = new char[15];
        for (int i = 1; i < array.length; i++) {
            array[i] = (char) (new Random().nextInt(127));
        }

//        for (int i = 0; i < array.length; i++) {
//            int temp = new Random().nextInt(127);
//           // System.out.print(temp + " ");
//            array[i] = (char) temp;
//            System.out.println(array[i]);
//        }
        String stringArr = Arrays.toString(array);
        System.out.println(stringArr);
    }
}
