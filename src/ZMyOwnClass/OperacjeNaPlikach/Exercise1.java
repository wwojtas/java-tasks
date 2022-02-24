package ZMyOwnClass.OperacjeNaPlikach;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) throws IOException {


      //  Napisz program, który pobierze od użytkownika ścieżkę
        //  do pliku tekstowego oraz kilka linijek tekstu
        //  (dopóki użytkownik nie wprowadzi „-” jako linijki)
        //  i zapisze je do pliku tekstowego.
        //  Do wykonania tego zadania może Ci się przydać metoda System.lineSeparator()
        //  zwracająca znak nowej linii
        //  (jeśli chciałbyś oddzielić linie wprowadzone przez użytkownika).

        Scanner input = new Scanner(System.in);
        FileWriter output = null;
        String line;

        System.out.println("Podaj sciezke pliku wyjsciowego: ");
        try {
            output = new FileWriter(input.nextLine());
            System.out.println("Podaj zawartosc pliku: ");

            while (true) {
                line = input.nextLine();
                if (line.equals("-")) {
                    break;
                }
                output.write(line);
                output.write(System.lineSeparator());
            }
        }
        finally {
            if (output != null) {
                output.close();
            }
        }
    }
}