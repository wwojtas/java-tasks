package OOP.inheritance.shop;

public class Mouse extends Product{

    protected int numButtons;

    Mouse() {
        super(14.9f, "mouse", "Microsoft", 2020 );
       numButtons = 3;
    }


}
