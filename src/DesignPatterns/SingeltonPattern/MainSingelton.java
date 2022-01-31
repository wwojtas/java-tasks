package DesignPatterns.SingeltonPattern;

public class MainSingelton {
    public static void main(String[] args) {

        DBConnection dbConnection1 = DBConnection.getInstance();
        DBConnection dbConnection2 = DBConnection.getInstance();

        // sprawdzamy refenecje do obiektu
        System.out.println( dbConnection1 == dbConnection2 );  // true


    }
}


