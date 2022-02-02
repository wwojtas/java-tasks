package Kolekcje.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class MainLinkedList {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Adam");
        String p1 = "Ola";
        list.add(p1);

        // wrzucmay na początek kolekcji
        list.addFirst("Rafał");
        // wrzucamy na koniec
        list.addLast("Olaf");
//        [Rafał, Adam, Ola, Olaf]
        System.out.println("1. " +  list);

        System.out.println(list.getFirst()); //Rafał
        System.out.println(list.getLast()); // Olaf

        // usuwamy pierwszy i ostatni element
        list.removeLast();  // Olaf remove
        list.removeFirst(); // Rafał remove
        System.out.println(list); // [Adam, Ola]

        System.out.println(list.contains(p1)); // true - Ola

        list.add("Daniel");
        list.add("Kuba");
        list.add(p1);
        list.add("Ania");
        System.out.println(list); // [Adam, Ola, Daniel, Kuba, Ola, Ania]

        list.removeFirstOccurrence(p1);
        list.removeLastOccurrence("Ania");
        System.out.println(list);

        list.add(2, "Zenon");
        list.set(0, "Katarzyna");
        System.out.println(list.size());

        ListIterator<String> iterator1 = list.listIterator();
        while(iterator1.hasNext()) {
            String str = iterator1.next();
            System.out.println(str);
        }
        System.out.println("==");
        ListIterator<String> iterBack = list.listIterator(list.size());
        while(iterBack.hasPrevious()) {
            String str = iterBack.previous();
            System.out.println(str);
        }










    }
}
