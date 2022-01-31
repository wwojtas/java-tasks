package OOP.inheritance.interface_static_final;

public class Parrot implements Bird{

    @Override
    public int getNumLegs() {
        return 0; // Implementuje po Animal
    }

    @Override
    public String getName() {
        return "Parrot"; // Implementuje po Animal
    }

    @Override
    public void eat() {
        System.out.println("Eating"); // Implementuje po Eating
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying"); // Implementuje po Flying
    }

    @Override
    public void searchForFood() {
//        Bird.super.searchForFood();  //  Implementuje po Eating
//        powyżej wartość domyślna implementowana z Bird a dziedziczona
//        przez Bird z interfejsu Eating
        System.out.println("parrot is searching for food");
    }

    


}
