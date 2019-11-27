package collectionsHomeWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static javax.swing.UIManager.put;

public class CategoryPhoneBook {

    public static class PhoneBook {

        public static HashMap<String, String> initPhoneBook(){
            Scanner s = new Scanner(System.in);
            String contactName = s.nextLine();
            String contactPhone = s.nextLine();
            HashMap<String, String> phoneBook = new HashMap<>();
            phoneBook.putIfAbsent(contactName,  contactPhone );
            return phoneBook;
        }
    }

    public static void main(String[] args) {

        String category = "Work";
        Map<String, HashMap<String, String>> map = new HashMap<>();
        map.put(category, PhoneBook.initPhoneBook());

        System.out.println(map);
        HashMap<String, String> initMap = new HashMap<>();
         initMap.put("name", "phone");
        map.putIfAbsent("work", initMap);




    }
}
