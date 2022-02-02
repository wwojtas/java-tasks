package Kolekcje.PriorityQueueComparator;

import java.util.Comparator;

public class AscendingComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer x, Integer y) {
        if(x == y) return 0;
        if(x > y) return 1;
        else return -1;
    }
}
