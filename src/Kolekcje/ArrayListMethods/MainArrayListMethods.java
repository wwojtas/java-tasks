package Kolekcje.ArrayListMethods;

import java.util.ArrayList;

public class MainArrayListMethods {
    public static void main(String[] args) {

    Person p1 =new Person("Adam");
    Person p2 =new Person("Kasia");
    Person p3 =new Person("Rafał");
    Person p4 =new Person("Anna");

    ArrayList<Person> arr1 = new ArrayList<>();
    arr1.add(p1);
    arr1.add(p2);
    arr1.add(p3);
    arr1.add(p4);

    for (Person i: arr1) {
        System.out.println(i);
    }

    // druga kolekcja
    Person p5 =new Person("Bartek");
    Person p6 =new Person("Marek");
    ArrayList<Person> arr2 = new ArrayList<>();
    arr2.add(p5);
    arr2.add(p6);

    // do kolekcji arr1 dodalismy kolekcje arr2
    arr1.addAll(arr2);
        System.out.println("\n Po dodaniu kolekcji arr2");
        for (Person i :
                arr1) {
            System.out.println(i);
        }

        if(arr1.contains(p4)) {
            System.out.println("Arr1 zawiera p4");
        }
        if(arr1.containsAll(arr2)) {
            System.out.println("Arr1 zawiera arr2");
        }
        Person p7 = new Person("Daniel");
        arr2.add(p7);
        if(arr1.containsAll(arr2)) {
            System.out.println("Arr1 zawiera arr2");
        } else {
            System.out.println("Arr1 nie posiada arr2");
        }
        arr2.remove(p7);
        if(arr1.containsAll(arr2)) {
            System.out.println("Arr1 zawiera arr2");
        }
        // usuwamy z kolekcji arr1 kolekcję arr2
        arr1.removeAll(arr2);
        System.out.println("Po usunięciu  kolekcji arr2 z arr1");
        for (Person i : arr1) {
            System.out.println(i);
        }

        // przetwarzamy na tablicę
        // tablica z ilością elementów arr1.size()
        Person people[] = new Person[arr1.size()];
        people = arr1.toArray(people);
        System.out.println(people.length);

        // opróżnienie całej kolekcji za pomocą metody clear
        arr1.clear();
        if(arr1.isEmpty()) {
            System.out.println("Arr1 pusta");
        }







    }
}
