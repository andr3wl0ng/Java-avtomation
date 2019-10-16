package application.homeWork;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Array8X5RandomFrom10to99 {
    public static void main(String[] args) {

        Random random = new Random();
        int [][] doubleArray = new int[8][5];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                doubleArray[i][j] = random.nextInt(99);
                //doubleArray[i][j] = (int) (Math.random()  * 90)+10;
                System.out.print(doubleArray[i][j]+ "  ");
            }
          System.out.println( );
        }

    }
}
