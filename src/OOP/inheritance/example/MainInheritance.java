package OOP.inheritance.example;

public class MainInheritance {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle("Tom", 10.5f);
//        bicycle.type = "Bicykl";
//        bicycle.topSpeed = 15.0f;
//        bicycle.manufacturer = "Giant";
        bicycle.printInfo();

        SuperBicycle superBicycle = new SuperBicycle("Super", 1.45f);
        superBicycle.printInfo();



    }
}
