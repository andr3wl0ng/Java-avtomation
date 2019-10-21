package application.coffeeMachine;

public class Recipes {

    public static void main(String[] args) {


        RecipeComponentBase espresso = new RecipeComponentBase();
        espresso.preparedDrink = espresso.coffee + espresso.water / 2;


        RecipeComponentBase americano = new RecipeComponentBase();
        americano.preparedDrink = (americano.coffee * 2) + (americano.water * 3);


        RecipeComponentBase americanoWithMilk = new RecipeComponentBase();
        americanoWithMilk.preparedDrink = (americanoWithMilk.coffee * 2) + (americanoWithMilk.water * 3) + americanoWithMilk.milk;

        RecipeComponentBase doubleEspresso = new RecipeComponentBase();
        doubleEspresso.preparedDrink = espresso.coffee * 2;

    }

}

class RecipeComponentBase {
    int coffee = 10;
    int milk = 10;
    int water = 10;

    int preparedDrink;
}