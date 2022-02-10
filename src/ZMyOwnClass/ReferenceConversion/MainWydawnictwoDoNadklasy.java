package ZMyOwnClass.ReferenceConversion;

public class MainWydawnictwoDoNadklasy {
    public static void main(String[] args) {


        Publikacja p1 = Wydawnictwo.utworzPublikacje(1);  // 1 - książka
        Publikacja p2 = Wydawnictwo.utworzPublikacje(2);  // 2 - czasopismo
        Wydawnictwo.roznicaCeny(p1, p2); // konwersja referencyjna przy zwracaniu wyniku z Wydawnictwo.java

        // Kolejna konwersja
        Ksiazka p11 = new Ksiazka("Barteczko", "Java", 56.45);
        Czasopismo p22 = new Czasopismo(11, "PC Format", 9.50);
        Wydawnictwo.roznicaCeny(p11, p22); // konwersja referencyjna przy przekazywaniu argumentów

        System.out.println(Wydawnictwo.roznicaCeny(p11, p22));

        // konwersja referencyjna przy przypisywaniu
        p1 = p11;  // Ksiazka rzutowana jest na Publikacja
        p2 = p22;  // Czasopismo rzutowany jest  Publikacja

        System.out.println(Wydawnictwo.roznicaCeny(p1, p2));

    }
}
