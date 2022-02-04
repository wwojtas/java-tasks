package Streams.StreamsBasic;

import java.util.ArrayList;

public class MainStreamsBasic {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Asia");
        arr.add("Paweł");
        arr.add("Daniel");
        arr.add("Ola");
        arr.add("Zuzanna");
        arr.add("Zenon");

        arr.stream()
                .filter(str -> str.length() > 3 && str.length() < 6 )
                .filter( str -> str.startsWith("A") || str.startsWith("P"))
                .forEach(str -> System.out.println(str));

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Dodge", 250, 300000, 4));
        cars.add(new Car("Citroen", 180, 200000, 3));
        cars.add(new Car("Opel", 220, 150000, 4));
        cars.add(new Car("Merc", 250, 400000, 5));
        cars.add(new Car("GMC", 170, 100000, 3));
        cars.add(new Car("Porsche", 300, 800_000, 5));
        cars.add(new Car("BMW", 240, 300_000, 5));

        cars.stream()
                .filter(car -> car.rating > 3)
                .filter(car -> car.price >= 200_000 && car.price < 600_000)
                .filter(car -> car.topspeed >= 200 && car.topspeed < 300)
                .forEach(car -> System.out.println(car));

    }
}
