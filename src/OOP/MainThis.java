package OOP;

public class MainThis {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Mondeo");
        System.out.println(car.model);

    }
}

class Car{
    String manufacturer;
    String model;
    int numWheels;
    Car() {
        this.numWheels = 4;
    }
    Car(String amanufacturer, String amodel) {
        this();
        manufacturer = amanufacturer; // bez this bo brak konfliktu
        model = amodel;  // nazw klasy i parametru
    }
}
