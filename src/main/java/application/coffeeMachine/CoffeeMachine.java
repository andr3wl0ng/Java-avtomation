package application.coffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        System.out.println("Select your drink :");
        System.out.println("For 'Espresso' press - 1" );
        System.out.println("For 'Americano' press - 2" );
        System.out.println("For 'Americano With Milk' press - 3" );
        System.out.println("For 'Double Espresso' press - 4" );

        Scanner scanner = new Scanner(System.in);
        int Selection = scanner.nextInt();

    }

}


