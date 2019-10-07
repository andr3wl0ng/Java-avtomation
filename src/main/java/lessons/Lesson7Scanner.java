package lessons;

import java.util.Scanner;

public class Lesson7Scanner {
    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);
        System.out.println("Input something");
        String str= scan.nextLine();
        System.out.println();
        System.out.println("Your inout: "+str);


        Scanner s = new Scanner(System.in);
        System.out.println("input some number");
        int x = s.nextInt();
        System.out.println("your number is: "+x);

        System.out.println("your all inputs: " + "1- "+str + " " +"2- : "+ x);

    }
}
