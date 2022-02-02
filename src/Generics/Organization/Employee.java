package Generics.Organization;

public class Employee extends Person{

    private String jobTitle;

    public Employee(String name, String jobTitle) {
        super(name);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + this.getName() + '\'' +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
