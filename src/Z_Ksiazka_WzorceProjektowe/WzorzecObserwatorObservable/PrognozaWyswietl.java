package Z_Ksiazka_WzorceProjektowe.WzorzecObserwatorObservable;


import java.util.Observable;
import java.util.Observer;

public class PrognozaWyswietl implements Observer, WyswietlElement {

    private float biezaceCisnienie = 1010.1f;
    private float ostatnieCisnienie;

    public PrognozaWyswietl(Observable observable) {
        DanePogodowe danePogodowe = (DanePogodowe) observable;
        observable.addObserver(this);
    }

    public void update(Observable observable, Object arg) {
        if (observable instanceof DanePogodowe) {
            ostatnieCisnienie = biezaceCisnienie;
            biezaceCisnienie = ((DanePogodowe) observable).pobierzCisnienie() ;
            wyswietl();
        }
    }

    @Override
    public void wyswietl() {

    }


}
