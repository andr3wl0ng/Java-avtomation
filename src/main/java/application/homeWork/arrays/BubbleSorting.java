package application.homeWork.arrays;

import java.util.Arrays;
import java.util.Random;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt() % 50;
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr.length-1; ++j) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
//                    arr[j] = arr[j + 1] + arr[j];
//                    arr[j + 1] = arr[j] - arr[j + 1];
//                    arr[j] = arr[j] - arr[j+1];
                }
                System.out.println("-------\n");
                System.out.println(Arrays.toString(arr));
            }
        }
    }
}
