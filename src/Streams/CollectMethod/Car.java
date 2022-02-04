package Streams.CollectMethod;


public class Car {

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
}
