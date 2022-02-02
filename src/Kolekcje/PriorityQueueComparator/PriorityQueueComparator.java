package Kolekcje.PriorityQueueComparator;

import java.util.PriorityQueue;

public class PriorityQueueComparator {
    public static void main(String[] args) {


        PriorityQueue<Integer> pQ =
                new PriorityQueue<>(new AscendingComparator());
        pQ.add(99);
        pQ.add(12);
        pQ.add(14);
        pQ.add(67);

        while(!pQ.isEmpty()) {
            System.out.println(pQ.poll());
        }
    }
}
