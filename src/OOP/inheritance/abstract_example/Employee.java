package OOP.inheritance.abstract_example;

public class Employee extends Person{

    public Employee(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public void printInfo() {
        System.out.println("Employee: " + this.getName() + " " + this.getSurname() + " " + this.getAge() +  " lata");
    }
}
