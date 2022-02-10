package ZMyOwnClass.ReferenceConversion;

public class Wydawnictwo {


    static Publikacja utworzPublikacje(int rodzaj) {
        switch (rodzaj) {
            case 1: // utworz ksiazke
                // konwersja referencyjna przy zwracaniu wyniku
                return new Ksiazka("Barteczko", "Java", 56.45);

            case 2: // utwórz czasopismo
                // konwersja referencyjna przy zwracaniu wyniku
                return new Czasopismo(11, "PC Format", 9.50);
        }
        return null;
    }


    static double roznicaCeny(Publikacja p1, Publikacja p2) {
        return p1.podajCena() - p2.podajCena();
    }


}
