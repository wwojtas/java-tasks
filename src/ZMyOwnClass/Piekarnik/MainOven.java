package ZMyOwnClass.Piekarnik;

public class MainOven {
    public static void main(String[] args) {

        Oven oven = new Oven();  // tworzymy obiekt oven
        BakingOven bakingOven = oven;  // przypisujemy referencje
        RoastingOven roastingOven = oven;

        oven.bakeBread();
        oven.bakeCookies();
        oven.roastChicken();

        bakingOven.bakeBread();
        bakingOven.bakeCookies();

        roastingOven.roastChicken();
    }
}
