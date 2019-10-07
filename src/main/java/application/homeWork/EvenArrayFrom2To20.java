package application.homeWork;

/*
Создайте массив из всех чётных чисел от 2 до 20
выведите элементы массива на экран сначала в строку,
отделяя один элемент от другого пробелом,
а затем в столбик (отделяя один элемент от другого началом новой строки).
Перед созданием массива подумайте, какого он будет размера.
*/


public class EvenArrayFrom2To20 {
    public static void main(String[] args) {

        int size = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) size++;
        }
        int[] EvenArr = new int[size];
        for (int i = 2, a = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                EvenArr[a] = i;
                System.out.print(EvenArr[a] + " ");
                a++;
            }
        }
        System.out.println(" ");
        for (int i = 0; i < EvenArr.length; i++) {
            System.out.println(EvenArr[i]);
        }

    }
}
