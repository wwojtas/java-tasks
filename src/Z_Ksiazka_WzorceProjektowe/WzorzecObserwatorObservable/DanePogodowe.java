package Z_Ksiazka_WzorceProjektowe.WzorzecObserwatorObservable;

import java.util.Observable;
import java.util.Observer;

public class DanePogodowe extends Observable {

    private float temperatura;
    private float wilgotnosc;
    private float cisnienie;
    public DanePogodowe() { }
    public void odczytyZmiana() {
        setChanged();
        notifyObservers();
    }
    public void ustawOdczyty(float temperatura, float wilgotnosc, float cisnienie) {
        this.temperatura = temperatura;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;
//        odczytyZmiana();
    }
    public float pobierzTemperaturę() {
        return temperatura;
    }
    public float pobierzWilgotnosc() {
        return wilgotnosc;
    }
    public float pobierzCisnienie() {
        return cisnienie;
    }
}
