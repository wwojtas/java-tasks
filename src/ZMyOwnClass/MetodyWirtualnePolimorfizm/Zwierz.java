package ZMyOwnClass.MetodyWirtualnePolimorfizm;

public class Zwierz {

    String nazwa = "nieznany";
    Zwierz(){}
    Zwierz(String n){
        nazwa = n;
    }

    String podajGatunek(){
        return "Jakies zwierze";
    }
    String podajNazwe(){
        return "nazwa";
    }
    String podajGlos(){
        return "?";
    }
    void mowa() {
        System.out.println(podajGatunek() + " "
                + podajNazwe() + " mowi " +
                podajGlos());
    }
}
