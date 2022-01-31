package OOP.inheritance.shop;

import java.security.Key;
import java.sql.SQLOutput;

public class Keybord extends Product {

    protected int numKeys;

    Keybord() {
        super(14.9f, "Klawiatura", "Alma", 2022 );
        numKeys = 104;
    }

}
