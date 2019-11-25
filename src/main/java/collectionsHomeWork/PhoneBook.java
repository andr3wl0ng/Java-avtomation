package collectionsHomeWork;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        category();


    }

    private static void category() {
        Scanner scanCategoryAmount = new Scanner(System.in);
        System.out.println("How many categories you need");
        int categoryAmount = scanCategoryAmount.nextInt();


        Map<String, Map<String, Integer>> categories = new HashMap<>();

        for (int i = 0; i < categoryAmount; i++) {
            System.out.println("insert category name: ");
            Scanner s = new Scanner(System.in);
            String categoryName = s.next();


           Map<String, Integer> phones = categories.putIfAbsent(categoryName, new HashMap<>());
           // categories.putIfAbsent(categoryName, new HashMap<>()).put(s.next(), s.nextInt());

        }
        System.out.println(categories);
    }
}
