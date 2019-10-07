package lessons;

import java.util.Scanner;

public class Lesson8DoWhile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please, input 5");
        int value = scanner.nextInt();
        while (value!=5){
            System.out.println("PLEASE, input 5");
            value= scanner.nextInt();
        }
        System.out.println("Good job! Your input is " +value);
    }
}
