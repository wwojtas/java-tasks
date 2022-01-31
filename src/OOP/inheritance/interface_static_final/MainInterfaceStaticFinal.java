package OOP.inheritance.interface_static_final;

public class MainInterfaceStaticFinal {
    public static void main(String[] args) {

        Parrot parrot = new Parrot();
        parrot.fly();
        parrot.searchForFood();
        System.out.println(   parrot.getDefaultWingspan());
        System.out.println("Domyślna liczba skrzydeł: " + Flying.getDefaultNumWings());


    }
}
