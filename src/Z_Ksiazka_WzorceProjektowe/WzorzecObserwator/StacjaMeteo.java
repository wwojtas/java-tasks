package Z_Ksiazka_WzorceProjektowe.WzorzecObserwator;

public class StacjaMeteo {
    public static void main(String[] args) {
        DanePogodowe danePogodowe = new DanePogodowe();
        WarunkiBiezaceWyswietl warunkiBieżąceWyświetl = new WarunkiBiezaceWyswietl(danePogodowe);
//        StatystykaWyświetl statystykaWyświetl = new StatystykaWyświetl(danePogodowe);
//        PrognozaWyświetl prognozaWyświetl = new PrognozaWyświetl(danePogodowe);
        danePogodowe.ustawOdczyty(26.6f, 65, 1013.1f);
        danePogodowe.ustawOdczyty(27.7f, 70, 997.0f);
        danePogodowe.ustawOdczyty(25.5f, 90, 997.0f);
    }
}
