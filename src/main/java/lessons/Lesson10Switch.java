package lessons;

import java.util.Scanner;

public class Lesson10Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your age");
        int age = scanner.nextInt();
        switch (age){
            case 0:
                System.out.println("you born");
                break;
            case 7:
                System.out.println("you go to school");
                break;
            case 18:
                System.out.println("you finish school");
                break;
            default:
                System.out.println("no match");
        }

    }
}
