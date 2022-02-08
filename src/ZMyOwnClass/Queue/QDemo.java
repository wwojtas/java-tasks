package ZMyOwnClass.Queue;

public class QDemo {
    public static void main(String[] args) {

        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Używam kolejki bigQ do przechowywania alfabetu");
        // umieszcza znaki alfabetu w bigQ
        for ( i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }
        //pobiera elementy bigQ i wyświetla je
        System.out.println("Zawartość kolejki bigQ: ");
        for ( i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.println(ch);
        }
        System.out.println("\n");

        System.out.println("używam kolejki smallQ do wygenerowania błędów");
        // Uzywa smallQ do wygenerowania błędów
        for ( i = 0; i < 5; i++) {
            System.out.println("Probuję umieścić w kolejce znak " + (char)('Z' - i ));
            smallQ.put((char)('Z' - i) );
            System.out.println();
        }
        System.out.println();
        // następny błąd kolejki smallQ
        System.out.println("Zawartość kolejki smallQ");
        for ( i = 0; i < 5; i++) {
            ch = smallQ.get();
            if( ch != (char) 0) System.out.println(ch);
        }



    }
}
