package DesignPatterns.SingeltonPattern;

// wymuszenie aby programiści korzystali z jakiejś metody
// np połączenie z bazą danych

class DBConnection {

    private static DBConnection instance;
    public DBConnection() {
    }

    public static DBConnection getInstance() {
        if(instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

}
