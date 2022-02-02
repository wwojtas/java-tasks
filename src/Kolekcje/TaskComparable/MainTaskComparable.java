package Kolekcje.TaskComparable;

import java.util.PriorityQueue;

public class MainTaskComparable {
    public static void main(String[] args) {


        PriorityQueue<Task> test = new PriorityQueue<>();
        test.add(new Task(7, "Zakupy"));
        test.add(new Task(1, "Praca"));
        test.add(new Task(10, "Film"));
        test.add(new Task(4, "Nauka"));

        while(!test.isEmpty()){
            System.out.println(test.poll());

        }
        // comparator
        System.out.println("--");
        test = new PriorityQueue<>(new TaskComparator());
        test.add(new Task(7, "Zakupy"));
        test.add(new Task(1, "Praca"));
        test.add(new Task(10, "Film"));
        test.add(new Task(4, "Nauka"));

        while(!test.isEmpty()){
            System.out.println(test.poll());

        }




    }
}
