package Streams.SummingInt;


import java.util.Comparator;
import java.util.Objects;

public class Car implements Comparator<Car> {

    public String name;
    public int topspeed;
    public int price;
    public int rating; // 1-5

    public Car(String name, int topspeed, int price, int rating) {
        this.name = name;
        this.topspeed = topspeed;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", topspeed=" + topspeed +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return name.equals(car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    @Override
    public int compare(Car o1, Car o2) {
        return o1.name.compareTo(o2.name);
    }
}
