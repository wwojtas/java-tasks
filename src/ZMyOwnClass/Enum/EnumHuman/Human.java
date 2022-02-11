package ZMyOwnClass.Enum.EnumHuman;

public class Human {

    private KOLOR_OCZU kolorOczu;
    private KOLOR_WLOSOW kolorWlosow;
    private String imie;
    private int wiek;


    Human(KOLOR_OCZU kolorOczu, KOLOR_WLOSOW kolorWlosow, String imie, int wiek) {
        this.kolorOczu = kolorOczu;
        this.kolorWlosow = kolorWlosow;
        this.imie = imie;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }
}
