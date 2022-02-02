package Generics.Organization;

public class Contractor extends Employee{

    public Contractor(String name, String jobTitle) {
        super(name, jobTitle);
    }

    @Override
    public String toString() {
        return "Contractor{" + super.toString() + "}";
    }
}
