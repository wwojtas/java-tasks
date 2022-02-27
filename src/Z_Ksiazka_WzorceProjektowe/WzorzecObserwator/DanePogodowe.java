package Z_Ksiazka_WzorceProjektowe.WzorzecObserwator;

import java.util.ArrayList;

public class DanePogodowe implements Podmiot {

    private ArrayList obserwatorzy;
    private float temperatura;
    private float wilgotnosc;
    private float cisnienie;

    public DanePogodowe() {
        obserwatorzy = new ArrayList();
    }
    public void zarejestrujObserwatora(Obserwator o) {
        obserwatorzy.add(o);
    }
    public void usunObserwatora(Obserwator o) {
        int i = obserwatorzy.indexOf(o);
        if (i >= 0) {
            obserwatorzy.remove(i);
        }
    }
    public void powiadomObserwatorow() {
        for (int i = 0; i < obserwatorzy.size(); i++) {
            Obserwator Obs = (Obserwator)obserwatorzy.get(i);
            Obs.aktualizacja(temperatura, wilgotnosc, cisnienie);
        }
    }
    public void odczytyZmiana() {
        powiadomObserwatorow();
    }
    public void ustawOdczyty(float temperatura, float wilgotnosc, float cisnienie) {
        this.temperatura = temperatura;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;
        odczytyZmiana();
    }
// tutaj zamieść inne metody klasy DanePogodowe
}
