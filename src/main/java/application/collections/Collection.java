package application.collections;

import java.util.*;

public class Collection {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        String string1 = "abc";
        myList.add(string1);
        String string2 = "bcd";
        myList.add(string2);
        myList.add(string2);
        myList.add(string2);
        myList.add(string2);
        myList.add(string2);
        int theSize = myList.size();

        boolean isIn = myList.contains(string2);
        int index = myList.indexOf(string2);
        boolean isEmpty = myList.isEmpty();
        myList.remove(string1);
        boolean isIn1 = myList.contains(string1);
        Collections.sort(myList);
        Collections.reverse(myList);


        int a = 9;
        int a2 = 8;

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(a);
        arr.add(a2);
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);


        Map <String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("Andrew", 5);
    }
}

