package Generics.Organization;

import java.util.ArrayList;
import java.util.Iterator;

public class Organization<T extends Person> {

    private ArrayList<T> participants;

    public Organization() {
        participants = new ArrayList<T>();
    }

    public void addParticipant(T p) {
        participants.add(p);
    }

    public T getParticipant(int index) {
        return participants.get(index);
    }

    public void printParticipants() {
        Iterator<T> iter = participants.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
