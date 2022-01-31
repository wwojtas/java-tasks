package programs.scanner;

import java.util.Scanner;

public class BasicScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imie: ");
        String name = scanner.nextLine();
        System.out.println( "Twoje imie to: " + name);
    }
}
