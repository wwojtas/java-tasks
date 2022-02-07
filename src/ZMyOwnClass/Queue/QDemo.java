package ZMyOwnClass.Queue;

public class QDemo {
    public static void main(String[] args) {

        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Używam kolejki bigQ do przechowywania alfabetu");
        // umieszcza znaki alfabetu w bigQ
        for (int j = 0; j < 26; j++) {
            bigQ.put((char) ('A' + j));
        }
        //pobiera elementy bigQ i wyświetla je
        System.out.println("Zawartość kolejki bigQ: ");
        for (int j = 0; j < 26; j++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.println(ch);
        }
        System.out.println("\n");

        System.out.println();

    }
}
