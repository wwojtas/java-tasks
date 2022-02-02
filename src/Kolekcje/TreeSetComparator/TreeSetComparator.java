package Kolekcje.TreeSetComparator;

import Kolekcje.HashSetExample.Animal;

import java.util.TreeSet;

public class TreeSetComparator {
    public static void main(String[] args) {


        TreeSet<AnimalElement> animals = new TreeSet<>(new AnimalElementComparator());
        animals.add(new AnimalElement("Tiger"));
        animals.add(new AnimalElement("Lion"));
        animals.add(new AnimalElement("Dog"));

        for (AnimalElement a : animals) {
            System.out.println(a);
        }





    }
}
