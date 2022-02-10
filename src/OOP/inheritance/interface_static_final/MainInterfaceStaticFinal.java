package OOP.inheritance.interface_static_final;

public class MainInterfaceStaticFinal {
    public static void main(String[] args) {

        Parrot parrot = new Parrot();
        parrot.fly(); // implementuje fly po interface Flying
        parrot.searchForFood();  // implementuje po interface Eating
        System.out.println(   parrot.getDefaultWingspan());  // implementuje fly po interface Flying
        System.out.println("Domyślna liczba skrzydeł: " + Flying.getDefaultNumWings());


    }
}
