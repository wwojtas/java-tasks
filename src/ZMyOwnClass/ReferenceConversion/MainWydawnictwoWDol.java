package ZMyOwnClass.ReferenceConversion;

public class MainWydawnictwoWDol {
    public static void main(String[] args) {

        Publikacja publ1, publ2;
        String autor1, autor2;
        Ksiazka ksiaz;


        publ1 = Wydawnictwo.utworzPublikacje(1);
        publ2 = Wydawnictwo.utworzPublikacje(2);

        ksiaz = (Ksiazka) publ1;
        autor1 = ksiaz.podajAutor();
        System.out.println(autor1);

        ksiaz = (Ksiazka) publ2;
        autor2 = ksiaz.podajAutor();
        System.out.println(autor2);

//        autor1 = ((Ksiazka)publ1).podajAutor();
//        autor2 = ((Ksiazka)publ2).podajAutor();
//        System.out.println(autor1);
//        System.out.println(autor2);


    }
}
