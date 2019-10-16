package application.homeWork;

import java.util.Scanner;

public class InputIntTillExit {
    public static void main(String[] args) {
        String s = "exit";
        int sum = 0;
        boolean isEnd = false;
        Scanner scanner = new Scanner(System.in);

        while(!isEnd){
            String userChoice = scanner.nextLine();
            if (!userChoice.equals("exit")) {
                sum += Integer.parseInt(userChoice);
            } else {
                System.out.println("sum: " + sum);
                isEnd = false;
            }
        }
    }
}
