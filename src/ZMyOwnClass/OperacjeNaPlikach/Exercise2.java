package ZMyOwnClass.OperacjeNaPlikach;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) throws IOException {


      //  Napisz program, który pobierze od użytkownika ścieżkę
        //  do pliku i wyświetli zawartość pliku
        //  na ekranie wraz z informacją ile linii znajduje się w pliku.

        Scanner scanner = new Scanner(System.in);
        BufferedReader inputFile = null;
        int numberOfLines = 0;
        String line;

        System.out.println("Podaj sciezke pliku wejściowego: ");
        try{
            inputFile = new BufferedReader(new FileReader( scanner.next()));
            System.out.println("Zawartość pliku: ");
            while (true) {
                line = inputFile.readLine();
                if (line == null) break;
                numberOfLines++;
                System.out.println(line);
            }
        } finally {
            if(inputFile != null){
                inputFile.close();
            }
            System.out.println("Plik ma: " + numberOfLines + " linii");
        }

    }
}
