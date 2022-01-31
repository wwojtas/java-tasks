package OOP.inheritance.polymorphism_basics;

public class Manager extends Employee{

    private String departmentName;

    public Manager() {
        super();
        this.departmentName = "unknown";
    }

    public Manager(String name, String jobTitle, int salary, String departmentName) {
        super(name, jobTitle, salary);
        this.departmentName = departmentName;
    }
    public void printInfo() {
        System.out.println("Jestem manager");
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void hireEmployee() {
        System.out.println("Employee hire");
    }

    public void giveRise(Employee employee){
        System.out.println("Employee got rise");
    }
}
