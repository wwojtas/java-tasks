package ZMyOwnClass.MetodyWirtualnePolimorfizm;

public class Pies extends Zwierz{

    Pies(){}
    Pies(String n) {
        super(n);
    }

    String podajGatunek(){
        return "Pies";
    }

    String podajGlos(){
        return "Hau hau";
    }

}
