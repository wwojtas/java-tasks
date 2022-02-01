package Kolekcje.ArrayListBasics;

import java.util.ArrayList;
import java.util.Collections;

public class MainArrayList {
    public static void main(String[] args) {

        ArrayList basicList = new ArrayList();
        basicList.add(new String("test"));
        basicList.add("info");

        // element przechowywany w basicList pod indeksem 0
        // zapisujemy do zmiennej strEl
        // ale musimy najpierw zrobić rzutowanie na typ String
        String strEl = (String)basicList.get(0);
        System.out.println(strEl);

        ArrayList<String> arrStr = new ArrayList<String>();
        // dodajemy do listy
        arrStr.add("Kasia");
        arrStr.add("Adam"); // usunięty
        arrStr.add("Tomek");
        // usuwamy z listy
        arrStr.remove(1);
        arrStr.add("Boniek");

//        arrStr.add(0,"Zuza");
        for (String s: arrStr) {
            System.out.println(s);
        }
        System.out.println("\n Po zmianie set");
        arrStr.set(0, "Katarzyna");
        for (String s: arrStr) {
            System.out.println(s);
        }

        System.out.println("\n Po sortowaniu ");

        Collections.sort(arrStr);
        for (String s: arrStr
             ) {
            System.out.println(s);
        }

    }
}
