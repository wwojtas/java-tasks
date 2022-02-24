package Z_Ksiazka_WzorceProjektowe.TestowanieKaczki;

public abstract class Kaczka {

    LatanieInterfejs latanieInterfejs;
    KwakanieInterfejs kwakanieInterfejs;

    public Kaczka() {
    }

    public abstract void wyświetl();

    public void wykonajLec() {
        latanieInterfejs.lec();
    }

    public void wykonajKwacz() {
        kwakanieInterfejs.kwacz();
    }

    public void pływaj() {
        System.out.println("Wszystkie kaczki pływają, nawet te sztuczne!");
    }

    public void ustawLatanieInterfejs (LatanieInterfejs li) {
        latanieInterfejs = li;
    }
    public void ustawKwakanieInterfejs(KwakanieInterfejs ki) {
        kwakanieInterfejs = ki;
    }
}
