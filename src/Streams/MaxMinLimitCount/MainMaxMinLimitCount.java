package Streams.MaxMinLimitCount;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainMaxMinLimitCount {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Dodge", 250, 300_000, 4));
        cars.add(new Car("Citroen", 180, 200_000, 3));
        cars.add(new Car("Opel", 220, 150_000, 4));
        cars.add(new Car("Merc", 250, 400_000, 5));
        cars.add(new Car("GMC", 170, 100_000, 3));
        cars.add(new Car("Porsche", 300, 800_000, 5));
        cars.add(new Car("BMW", 240, 300_000, 5));

        // max

//        Car carHighestPrice = cars.stream()
//                .max((car1, car2) -> car1.price > car2.price ? 1 : -1)
//                .get();
//        System.out.println(carHighestPrice);

//        // min

//        Car carLowestPrice = cars.stream()
//                .min((car1, car2) -> car1.price > car2.price ? 1 : -1)
//                .get();
//        System.out.println(carLowestPrice);

        // limit()

//        List<Car> carsLimitElements = cars.stream()
//                .filter(car -> car.price < 500_000)
//                .limit(3)
//                .collect(Collectors.toList());
//        System.out.println(carsLimitElements);


        // count()

        int numcars = (int) cars.stream()
                .filter(car -> car.topspeed >= 200).count();
        System.out.println(numcars);


    }
}
