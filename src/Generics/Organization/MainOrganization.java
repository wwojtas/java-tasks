package Generics.Organization;

public class MainOrganization {
    public static void main(String[] args) {

        Organization<Employee> organization = new Organization<>();

        organization.addParticipant(new Employee("Adamek", "programista"));
        organization.addParticipant(new Employee("Tomek", "Hydraulik"));

        organization.addParticipant(new Contractor("Daniel", "silacz"));
        organization.printParticipants();


    }
}
