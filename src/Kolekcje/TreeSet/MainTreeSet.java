package Kolekcje.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class MainTreeSet {
    public static void main(String[] args) {


        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(56);
        treeSet.add(23);
        treeSet.add(4);
        treeSet.add(31);
        treeSet.add(8);

        Iterator<Integer> iter = treeSet.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
//        4, 8, 23, 31, 56

        // odwrotność
        Iterator<Integer> descIter = treeSet.descendingIterator();
        while (descIter.hasNext()){
            System.out.println(descIter.next());
        }




    }
}
