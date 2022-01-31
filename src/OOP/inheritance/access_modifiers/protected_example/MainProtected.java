package OOP.inheritance.access_modifiers.protected_example;

import OOP.inheritance.access_modifiers.protected_example.package2.Computer;

public class MainProtected {
    public static void main(String[] args) {

        Computer computer = new Computer();
//        computer.name; // bład - brak dostępu do name - protected
        computer.setName("Dell");
        System.out.println(computer.getName());

    }
}
