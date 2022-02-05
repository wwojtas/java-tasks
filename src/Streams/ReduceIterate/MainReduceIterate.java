package Streams.ReduceIterate;


import Streams.MaxMinLimitCount.Car;  // car z innego package
import java.util.ArrayList;
import java.util.stream.Stream;

public class MainReduceIterate {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Dodge", 250, 300_000, 4));
        cars.add(new Car("Citroen", 180, 200_000, 3));
        cars.add(new Car("Opel", 220, 150_000, 4));
        cars.add(new Car("Merc", 250, 400_000, 5));
        cars.add(new Car("GMC", 170, 100_000, 3));
        cars.add(new Car("Porsche", 300, 800_000, 5));
        cars.add(new Car("BMW", 240, 300_000, 5));

        // reduce

        int totalPrice = cars.stream()
                .reduce(0, (subtotal, car) -> subtotal + car.getPrice(), Integer::sum);
        System.out.println(totalPrice);

        // iterate

        // 1 wersja
        Stream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(s -> System.out.println(s));


        // 2 wersja
        Stream.iterate(0, n -> n < 5, n -> n + 1)
                .forEach(s -> System.out.println(s));




    }

}
