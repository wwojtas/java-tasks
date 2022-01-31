package OOP.inheritance.shop;

public class Monitor extends Product{

    protected int resolution = 1080;

    Monitor() {
        super(3.9f, "Monitor", "LG", 1989 );
        resolution = 1080;
    }


}
