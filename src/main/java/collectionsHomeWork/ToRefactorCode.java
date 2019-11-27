//package collectionsHomeWork;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class PhoneBook {
//    public static void main(String[] args) {
//        //category();
//    }
//
//    public class PhoneBookM{
//        Scanner s = new Scanner(System.in);
//        String contactName = s.next();
//        int contactPhone = s.nextInt();
//        Map<String, Integer> phoneBook = new HashMap<>();
//        phoneBook.putIfAbsent(contactName,  contactPhone );
//    }
//
//
//    private static void category() {
//        Scanner scanCategoryAmount = new Scanner(System.in);
//        System.out.println("How many categories you need");
//        int categoryAmount = scanCategoryAmount.nextInt();
//
//        Map<String, phoneBookM> categories = new HashMap<>();
//    }
//}
//
////
////    Map<String, Integer> phoneBook = new HashMap<>();
////
////    Map<String, > categories = new HashMap<>();
////        for (int i = 0; i < categoryAmount; i++) {
////        System.out.println("insert category name: ");
////        Scanner s = new Scanner(System.in);
////        String categoryName = s.next();
////        Map<String, Integer> phones = categories.putIfAbsent(categoryName, new HashMap<>());
////        // categories.putIfAbsent(categoryName, new HashMap<>()).put(s.next(), s.nextInt());
////
////        }
////        System.out.println(categories);