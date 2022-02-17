package ZMyOwnClass.Kolekcje.List;

import java.util.LinkedList;
import java.util.List;

public class MainList {
    public static void main(String[] args) {

        List<String> listWithNames = new LinkedList<>();
        listWithNames.add("Piotrek");
        listWithNames.add("Krzysiek");

        List<String> otherListWithNames = new LinkedList<>();
        otherListWithNames.add("Marek");
        otherListWithNames.addAll(listWithNames);
        otherListWithNames.add("Marek");

        System.out.println(otherListWithNames.contains("Marek")); // true
        System.out.println(otherListWithNames.get(0)); // Marek
        System.out.println(otherListWithNames.isEmpty()); // false
        System.out.println(otherListWithNames.indexOf("Marek")); // 0
        System.out.println(otherListWithNames.lastIndexOf("Marek")); // 3
    }
}
