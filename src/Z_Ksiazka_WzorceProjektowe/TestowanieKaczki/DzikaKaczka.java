package Z_Ksiazka_WzorceProjektowe.TestowanieKaczki;

public class DzikaKaczka extends Kaczka{


    public DzikaKaczka() {
        latanieInterfejs = new LatamBoMamSkrzydła();
        kwakanieInterfejs = new Kwacz();
    }

    @Override
    public void wyświetl() {
        System.out.println("Jestem prawdziwą Dziką Kaczką");
    }
}
