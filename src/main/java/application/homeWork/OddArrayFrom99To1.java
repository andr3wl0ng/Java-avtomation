package application.homeWork;

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