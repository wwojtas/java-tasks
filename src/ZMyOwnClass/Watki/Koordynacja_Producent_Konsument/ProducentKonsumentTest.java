package ZMyOwnClass.Watki.Koordynacja_Producent_Konsument;

public class ProducentKonsumentTest {
    public static void main(String[] args) {

        Bufor c = new Bufor();
        Producent p1 = new Producent(c, 1);
        Producent p2 = new Producent(c, 2);
        Konsument c1 = new Konsument(c, 1);
        Konsument c2 = new Konsument(c, 2);

        p1.start();
        p2.start();
        c1.start();
        c2.start();

    }
}
