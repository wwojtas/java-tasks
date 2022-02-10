package ZMyOwnClass.ReferenceConversion;

public class Czasopismo extends Publikacja {

    private int numer;

    public Czasopismo( int numer, String tytul, double cena) {
        super(tytul, cena);
        this.numer = numer;
    }

    public int podajNumer(){
        return numer;
    }

}
