package Streams.CollectorsToMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsToMap {
    public static void main(String[] args) {


        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Dodge", 250, 300_000, 4));
        cars.add(new Car("Citroen", 180, 200_000, 3));
        cars.add(new Car("Opel", 220, 150_000, 4));
        cars.add(new Car("Merc", 250, 400_000, 5));
        cars.add(new Car("GMC", 170, 100_000, 3));
        cars.add(new Car("Porsche", 300, 800_000, 5));
        cars.add(new Car("BMW", 240, 300_000, 5));

        // Pierwszy przykład

//        // Collectors to Map
//        Map<String, Car> carsMap = cars.stream()
//                .collect(Collectors.toMap(car -> car.name, car -> car));
//        System.out.println(carsMap);
//
//        // odwołanie się do danego elementu
//        Car car1 = carsMap.get("GMC");
//        System.out.println(car1);

        // Drugi przykład

        // Map i referencja do metody
        List<Integer> carPrices = cars.stream()
                .filter(car -> car.price < 300_000)
                .map(Car::getPrice).collect(Collectors.toList());
        System.out.println(carPrices);





    }
}
