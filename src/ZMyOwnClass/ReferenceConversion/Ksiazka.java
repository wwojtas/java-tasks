package ZMyOwnClass.ReferenceConversion;

public class Ksiazka extends Publikacja{

    private String autor;

    public Ksiazka(String autor, String tytul, double cena) {
        super(tytul, cena); // wywolanie konstruktora klasy bazowej
        this.autor = autor;
    }

    public String podajAutor(){
        return autor;
    }


}
