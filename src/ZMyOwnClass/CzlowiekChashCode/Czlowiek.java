package ZMyOwnClass.CzlowiekChashCode;

import java.util.Objects;

public class Czlowiek {

    private final String imie;
    private final String nazwisko;
    private String pesel;

    public Czlowiek(String imie, String nazwisko, String pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        if ( pesel == null) {
            throw new IllegalArgumentException("Every human needs to have PESEL!");
        }
        this.pesel = pesel;
    }

    @Override
    public boolean equals(Object o) {
        if( o instanceof Czlowiek ) {
            Czlowiek czlowiek = (Czlowiek) o;
            return pesel.equals(czlowiek.getPesel());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 11 * pesel.hashCode();
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
}
