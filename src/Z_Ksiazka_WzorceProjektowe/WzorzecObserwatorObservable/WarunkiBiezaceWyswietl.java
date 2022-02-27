package Z_Ksiazka_WzorceProjektowe.WzorzecObserwatorObservable;

import java.util.Observable;
import java.util.Observer;

public class WarunkiBiezaceWyswietl implements Observer, WyswietlElement {

    Observable observable;
    private float temperatura;
    private float wilgotnosc;
    public WarunkiBiezaceWyswietl(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    public void update(Observable obs, Object arg) {
        if (obs instanceof DanePogodowe) {
            DanePogodowe danePogodowe = (DanePogodowe)obs;
            this.temperatura = danePogodowe.pobierzTemperaturę();
            this.wilgotnosc = danePogodowe. pobierzWilgotnosc();
            wyswietl();
        }
    }

    @Override
    public void wyswietl() {
        System.out.println("Warunki bieżące " + temperatura
                + "stopni C oraz " + wilgotnosc + "% wilgotnosc");
    }


}
