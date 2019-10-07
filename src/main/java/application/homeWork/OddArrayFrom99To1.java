package application.homeWork;

/*
Создайте массив из всех нечётных чисел от 1 до 99,
выведите его на экран в строку,
а затем этот же массив выведите на экран в другую строку,
но в обратном порядке (99 97 95 93 … 7 5 3 1).
 */


public class OddArrayFrom99To1 {
    public static void main(String[] args) {
        int size = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                size++;
            }
        }
        int[] OddArray = new int[size];
        for (int i = 1, a = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                OddArray[a] = i;
                System.out.print(OddArray[a] + " ");
                a++;
            }
        }
        System.out.println(" ");
        for (int i = OddArray.length-1; i >= 0; --i) {
            System.out.println(OddArray[i]);
        }
    }
}