package OOP.inheritance.example;

public class Vehicle {
    public String type;
    public String manufacturer;
    public float topSpeed;

    Vehicle() {
        type = "unknown";
        manufacturer = "unknown";
        topSpeed = 0;
    }

    public void printInfo() {
        System.out.println("Type: " + this.type +
                " topSpeed: " + topSpeed +
                " manufacturer: " + manufacturer);
    }
}
