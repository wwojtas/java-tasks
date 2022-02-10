package ZMyOwnClass.MetodyWirtualnePolimorfizm;

public class WszystkieZwierzeta {
    public static void main(String[] args) {

        Zwierz z1 = new Zwierz();
        Zwierz z2 = new Zwierz("Inny zwierz");

        Pies pies = new Pies();
        Pies szarik = new Pies("Szarik");
        Pies reksio = new Pies("Reksio");
        Kot filemon = new Kot("Filemon");

        Zoo.dialogZwierzat(z1, z2);
    }
}
