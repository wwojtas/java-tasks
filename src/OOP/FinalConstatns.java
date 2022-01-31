package OOP;

public class FinalConstatns {
    public static void main(String[] args) {
        PointConstans point = new PointConstans(33,44);
        point.changePosition(55, 66);
        System.out.println("x: " + point.x + " y: " + point.y);
    }
}

class PointConstans {
    int x;
    int y;
    final int width = 12;
    final int height;

    PointConstans() {
        height = 20;
    }
    PointConstans(int posX, int posY) {
        this();
        this.x = posX;
        this.y = posY;
    }

    public void changePosition( int newX, final int newY) {
        newX = 30;  // tu następuje zmiana wartości argumentu
        x = newX;
        y = newY;
    }
}
