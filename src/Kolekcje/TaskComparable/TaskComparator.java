package Kolekcje.TaskComparable;

import java.util.Comparator;

public class TaskComparator implements Comparator<Task> {

    @Override
    public int compare(Task o1, Task o2) {
        int x = o1.getPriority();
        int y = o2.getPriority();
        if(x == y) return 0;
        if(x > y ) return 1;
        else return -1;
    }
}
