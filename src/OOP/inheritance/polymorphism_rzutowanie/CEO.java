package OOP.inheritance.polymorphism_rzutowanie;

public class CEO extends Manager {

    private int sharesNumber;

    public void signContract() {
        System.out.println("Contract sign");
    }

    public CEO() {
        this.sharesNumber = 100;
    }

    public CEO(String name, String jobTitle, int salary, String departmentName, int sharesNumber) {
        super(name, jobTitle, salary, departmentName);
        this.sharesNumber = sharesNumber;
    }

    public void printInfo() {
        System.out.println("Jestem CEO");
    }

    public int getSharesNumber() {
        return sharesNumber;
    }

    public void setSharesNumber(int sharesNumber) {
        this.sharesNumber = sharesNumber;
    }
}
