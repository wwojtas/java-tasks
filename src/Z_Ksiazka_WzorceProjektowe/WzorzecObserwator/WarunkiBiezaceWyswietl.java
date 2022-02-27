package Z_Ksiazka_WzorceProjektowe.WzorzecObserwator;

public class WarunkiBiezaceWyswietl implements Obserwator, WyswietlElement{

    private float temperatura;
    private float wilgotnosc;
    private Podmiot DanePogodowe;

    public WarunkiBiezaceWyswietl( Podmiot DanePogodowe) {
        this.DanePogodowe = DanePogodowe;
        DanePogodowe.zarejestrujObserwatora(this);
    }

    public void aktualizacja(float temperatura, float wilgotnosc, float cisnienie){
        this.temperatura = temperatura;
        this.wilgotnosc = wilgotnosc;
        wyswietl();
    }

    public void wyswietl(){
        System.out.println("Warunki biezace " + temperatura
                + " stopni C oraz " + wilgotnosc + " % wilgotność");
    }
}
