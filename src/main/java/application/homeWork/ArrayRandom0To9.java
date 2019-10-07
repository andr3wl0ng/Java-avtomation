package application.homeWork;

/*
Создайте массив из 15 случайных целых чисел из отрезка [0;9].
Выведите массив на экран. Подсчитайте сколько в массиве
чётных элементов и выведете это количество на экран на отдельной строке.
*/

public class ArrayRandom0To9 {
    public static void main(String[] args) {
        int[] array = new int[15];
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 9);
            if (array[i] % 2 == 0 && array[i] != 0) {
                size = size + 1;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        System.out.println("The amount of EVEN elements = "+size);
    }
}
