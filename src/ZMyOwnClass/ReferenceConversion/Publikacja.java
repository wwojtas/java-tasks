package ZMyOwnClass.ReferenceConversion;

public class Publikacja {

    private String tytul;
    private double cena;

    public Publikacja(String tytul, double cena) {
        this.tytul = tytul;
        this.cena = cena;
    }


    public String podajTytul() {
        return tytul;
    }

    public double podajCena() {
        return cena;
    }

}
