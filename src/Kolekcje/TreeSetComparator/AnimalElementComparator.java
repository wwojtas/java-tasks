package Kolekcje.TreeSetComparator;

import java.util.Comparator;

public class AnimalElementComparator implements Comparator<AnimalElement> {

    @Override
    public int compare(AnimalElement o1, AnimalElement o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
