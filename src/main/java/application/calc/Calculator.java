package application.calc;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        double number1 = getNumber();
        char operation = getOperation();
        double number2 = getNumber();
        double result = getResult(number1, number2, operation);
        System.out.println("result of operation is: "+result);
    }


    public static double getNumber() {
        System.out.println("input your number: ");
        double num;
        if (scanner.hasNextDouble()) {
            num = scanner.nextDouble();
        } else {
            System.out.println("Invalid input, Please input number");
            scanner.next();//рекурсия
            num = getNumber();
        }
        return num;
    }


    public static char getOperation(){
        System.out.println("input operation: ");
        char operation;
        String str = scanner.nextLine();
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Invalid input, Please input number");
            scanner.next();//rrr
            operation = getOperation();
        }
        return operation;
    }


    public static double getResult(double number1, double number2, char operation){
        double result;
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                System.out.println("Operation is not valid. Please input correct operation '+', '-', '*', '/'");
                result = getResult(number1, number2, getOperation());
        }
        return result;
    }
}
