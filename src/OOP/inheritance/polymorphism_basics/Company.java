package OOP.inheritance.polymorphism_basics;

public class Company {
    public static void main(String[] args) {

        Employee employee = new Employee("Adam", "Programmer", 10000);
        Manager manager = new Manager("Tom", "Team leader", 10000, "R&D");
        CEO ceo = new CEO("Rafal", "Prezes", 20000, "Board", 100);

        // utworzenie nowego CEO i przypisanie do obiektu person klasy Employee
        Employee worker = ceo;
//        worker.doWork();
//        ceo.signContract();

        employee.printInfo();
        manager.printInfo();
        ceo.printInfo();




    }
}
