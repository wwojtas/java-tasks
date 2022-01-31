package OOP.inheritance.example;

public class Bicycle extends Vehicle{


//    Bicycle() {
//        this.type = "Car";
//        this.manufacturer = "Ford";
//        this.topSpeed = 200;
//    }

    Bicycle(String manufacturer, float topSpeed) {
        super(); // wywołanie konstruktora z klasy nadrzędnej
        this.manufacturer = manufacturer;
        this.topSpeed = topSpeed;
    }

}
