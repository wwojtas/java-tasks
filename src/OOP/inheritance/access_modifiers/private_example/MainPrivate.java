package OOP.inheritance.access_modifiers.private_example;

public class MainPrivate {
    public static void main(String[] args) {

        Car car = new Car();
        System.out.println(car.getName());

        car.setName("Mustang");
        System.out.println(car.getName());
    }
}
