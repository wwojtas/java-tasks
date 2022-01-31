package OOP.inheritance.polymorphism_rzutowanie;

public class CompanyCasting {
    public static void main(String[] args) {

        Employee employee = new Employee("Adam", "Programmer", 10000);
        Manager manager = new Manager("Tom", "Team leader", 10000, "R&D");
        Employee employeeCeo = new CEO("Rafal", "Prezes", 20000, "Board", 100);


        if(employeeCeo instanceof CEO) {
            CEO ceo = (CEO) employeeCeo;
            ceo.signContract();
        }





    }
}
