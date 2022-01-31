package OOP.inheritance.interface_static_final;

public interface Eating {

    void eat();

    default void searchForFood() {
        System.out.println("Searching for food");
    }
}
