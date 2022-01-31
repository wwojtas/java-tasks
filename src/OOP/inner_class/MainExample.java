package OOP.inner_class;

public class MainExample {
    public static void main(String[] args) {

        SomeExample someExample = new SomeExample();
        someExample.run();

        SomeExample.PublicClass publicClass = someExample.new PublicClass();
        publicClass.printInfo();

    }
}
