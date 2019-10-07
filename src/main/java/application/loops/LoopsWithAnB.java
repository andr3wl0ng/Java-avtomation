package application.loops;

import java.util.Scanner;

public class LoopsWithAnB {
    public static void main(String[] args) {

        Scanner newScanner = new Scanner(System.in);

        System.out.println("input a:");
        int a = newScanner.nextInt();

        System.out.println("input b:");
        int b = newScanner.nextInt();

        if (a <= b) {
            System.out.println("a = " + a + " " + "b = " + b);
        } else {
            while (a > b) {
                a--;
                System.out.println("a now is: " + a);
                System.out.println("b now is: " + b);
                System.out.println();
            }
        }


    }
}

