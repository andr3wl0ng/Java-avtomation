package application.homeWork.arrays;

/*
Создайте массив из 15 случайных целых чисел из отрезка [0;9].
Выведите массив на экран. Подсчитайте сколько в массиве
чётных элементов и выведете это количество на экран на отдельной строке.
*/

import java.util.Random;

public class ArrayRandom0To9 {
    public static void main(String[] args) {
        int[] array = new int[15];
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 9);
           // Math.abs((new Random(666).nextInt()));    Take a look on this: Add bounder for random
            if (array[i] % 2 == 0 && array[i] != 0) {
                size = size + 1;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        System.out.println("The amount of EVEN elements = "+size);
    }
}
