package Kolekcje.PriorityQueue;

import java.util.PriorityQueue;

public class MainPriorityQueue {
    public static void main(String[] args) {


        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        pQ.add(99);
        pQ.add(12);
        pQ.add(14);
        pQ.add(67);

        while(!pQ.isEmpty()) {
            System.out.println(pQ.poll());
        }
    }
}
