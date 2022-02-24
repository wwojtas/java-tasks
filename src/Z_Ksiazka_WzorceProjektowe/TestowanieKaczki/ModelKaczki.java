package Z_Ksiazka_WzorceProjektowe.TestowanieKaczki;

public class ModelKaczki extends Kaczka{


    public ModelKaczki(){
        latanieInterfejs = new NieLatam();
        kwakanieInterfejs = new NieKwacz();
    }

    @Override
    public void wyświetl() {
        System.out.println("Jestem modelem kaczki");
    }
}
