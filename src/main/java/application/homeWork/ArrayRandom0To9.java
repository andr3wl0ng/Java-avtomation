package application.homeWork;

public class ArrayRandom0To9 {
    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 9);
            System.out.print(array[i]+" ");
        }

    }
}
