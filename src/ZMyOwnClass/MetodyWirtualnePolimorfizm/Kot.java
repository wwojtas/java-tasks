package ZMyOwnClass.MetodyWirtualnePolimorfizm;

public class Kot extends Zwierz{

    Kot() {
    }
    Kot(String n) {
        super(n);
    }

    String podajGatunek(){
        return "Kot";
    }

    String podajGlos(){
        return "Miau miau";
    }




}
