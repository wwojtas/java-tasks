package Kolekcje.HashSetExample;

import java.util.HashSet;
import java.util.Iterator;

public class MainHashSetExample {
    public static void main(String[] args) {

        HashSet<Animal> set =  new HashSet<>();
        Animal a = new Animal("Tiger");

        set.add(a);
        set.add(a);
        set.add(new Animal("Lion"));
        set.add(new Animal("Dog"));
        set.add(new Animal("Tiger"));


        Iterator<Animal> iterAnim = set.iterator();
        while(iterAnim.hasNext()) {
            Animal animal = iterAnim.next();
            System.out.println(animal);
        }







    }
}
