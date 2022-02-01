package Kolekcje.IteratorMethods;

import java.util.ArrayList;
import java.util.Iterator;

public class MainIteratorMethods {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();

        arr.add("Dodge");
        arr.add("Pontiac");
        arr.add("Merc");

        //wyrażenie lambda i wyswietlenie elementów arr
        arr.iterator().forEachRemaining(element -> System.out.println(element));

        // usuniecie elementu

        Iterator<String> iterator = arr.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if(str.equalsIgnoreCase("Merc")) {
                iterator.remove();
            }
        }
        System.out.println(arr);


    }
}
