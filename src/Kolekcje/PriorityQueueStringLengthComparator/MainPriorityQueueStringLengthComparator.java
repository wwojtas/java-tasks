package Kolekcje.PriorityQueueStringLengthComparator;

import java.util.Comparator;
import java.util.PriorityQueue;

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}

public class MainPriorityQueueStringLengthComparator {
    public static void main(String[] args) {

        PriorityQueue<String> test = new PriorityQueue<>(new StringLengthComparator());
        test.add("Daniel");
        test.add("Adam");
        test.add("Tomek");
        test.add("Zuza");

        while (!test.isEmpty()){
            System.out.println(test.poll()); // pobieranie i zdejmowanie elementu z kolejki

        }

    }
}
