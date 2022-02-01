package Kolekcje.LinkedList;

import java.util.LinkedList;

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
        System.out.println(list);

        System.out.println(list.getFirst()); //Rafał
        System.out.println(list.getLast()); // Olaf

        // usuwamy pierwszy i ostatni element
        list.removeLast();
        list.removeFirst();
        System.out.println(list); // [Adam, Ola]

        System.out.println(list.contains(p1)); // true - Ola

        list.add("Daniel");
        list.add("Kuba");
        list.add(p1);
        list.add("Ania");

        list.removeFirstOccurrence(p1);
        list.removeLastOccurrence("Ania");
        System.out.println(list);




    }
}
