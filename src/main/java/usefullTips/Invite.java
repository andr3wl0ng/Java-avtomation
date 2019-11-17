package usefullTips;


import java.util.Scanner;
public class Invite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select where you want to go out : ");
        System.out.println("For Apple Pie press - 1 ");
        System.out.println("For Chocolate Pie press - 2 ");
        System.out.println("For Cheese Cake press - 3 ");
        int choice = scanner.nextInt();
        choice(choice);
    }
    private static void choice(int choice) {
        switch (choice){
            case 1:
                System.out.println("We are going to... you tell me, have no idea where to try good Apple Pie  ");
                break;
            case 2:
                System.out.println("We are going to Veterano Brownie");
                break;
            case 3:
                System.out.println("We are going to Milk Bar");
                break;
            default:
                System.out.println("No match. Lets try again ");
                choice(choice);
        }
    }
}