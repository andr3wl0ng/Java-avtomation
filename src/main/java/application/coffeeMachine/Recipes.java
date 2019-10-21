package application.coffeeMachine;

public class Recipes {

    public static void main(String[] args) {


        Recipy espresso = new Recipy();
        espresso.coffee = 10;
        espresso.water = 20;

        Recipy americano = new Recipy();
        americano.coffee = 30;
        americano.water = 40;

        Recipy americanoWithMilk = new Recipy();
        americanoWithMilk.coffee = 30;
        americanoWithMilk.water = 40;
        americanoWithMilk.milk = 20;

    }

}

class Recipy {
    double coffee;
    double milk;
    double sugar;
    double water;
}