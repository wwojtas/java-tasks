package OOP.inheritance.interface_static_final;

public interface Flying {

    float DEFAULT_WINGSPAN = 0.7F;  // domyślnie jest -- static final

    void fly();  // domyślnie jest public

    default void flyHigher() {
        System.out.println("Flying higher");
    }

    default float getDefaultWingspan() {
        // dlatego że jest to metoda statyczna to musimy odwołać się po nazwie interfejsu
        return Flying.DEFAULT_WINGSPAN;
    }

    static int getDefaultNumWings() {
        return 2;
    }


    //

}
