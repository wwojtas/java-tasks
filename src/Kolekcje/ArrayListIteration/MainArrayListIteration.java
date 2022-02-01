package Kolekcje.ArrayListIteration;

import java.util.ArrayList;
import java.util.Iterator;

public class MainArrayListIteration {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Charger", "Dodge", 1970));
        cars.add(new Car("T", "Ford", 1920));
        cars.add(new Car("Viper", "Dodge", 1970));

        // iterowanie po elementach
        //petla fori
        System.out.println("Pętla for: ");
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            System.out.println(car);
        }

        // petla for
        System.out.println("pętla for each");
        for (Car car : cars) {
            System.out.println(car);
        }

        // iterator
        System.out.println("Iterator");
        Iterator<Car> iterator = cars.iterator();
        while(iterator.hasNext()) {
            Car car = iterator.next();
            System.out.println(car);
        }


    }
}
