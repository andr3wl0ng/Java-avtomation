package application.coffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        SelectYourDrink();


        boolean statusOK = true;
        while (statusOK){
            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();

            Recipes.Drink drink = Recipes.Drink.getDrinkByType(selection);
            if (drink == null){
                System.out.println("Wrong Drink Type");
            } else {
                statusOK = CoffeeMaker.prepareDrink(drink);
                System.out.println(CoffeeMaker.coffeeTankCapacity);
                System.out.println(CoffeeMaker.waterTankCapacity);
                System.out.println(CoffeeMaker.milkTankCapacity);
                System.out.println(CoffeeMaker.trashTankCapacity);
                System.out.println("__________________________");
                System.out.println("You drink: "+ drink + " Is ready. Please, enjoy");

                System.out.println("__________________________");
                SelectYourDrink();

            }
        }




    }

    private static void SelectYourDrink() {
        System.out.println("For 'Espresso' press - 1" );
        System.out.println("For 'Americano' press - 2" );
        System.out.println("For 'Americano With Milk' press - 3" );
        System.out.println("For 'Late' press - 4" );
        System.out.println("For 'Hot Water' press - 5" );
        System.out.println("__________________________");
        System.out.println("Select your drink and press ENTER:");
    }

}


