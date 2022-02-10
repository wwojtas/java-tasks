package ZMyOwnClass.InterfejsZadanie;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Main main = new Main();
        Computation computation;
        // wartością zmiennej computation może być odwołanie do obiektu dowolnej klasy
        // która implementuje ten interfejs

        boolean flag = main.shouldMultiply();

        if(flag) {
            computation = new Mnozenie();  // konwersja referencyjna przy przypisywaniu
        } else {
            computation = new Dodawanie(); // konwersja referencyjna przy przypisywaniu
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();
        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        System.out.println("Wybierz: 1 - Mnozenie" + " Każda inny znak - Ddodawanie");
        return scanner.next().equals("1"); // tutaj zapytaj użytkownika co chce zrobić (mnożenie czy dodawanie)
    }

    private double getArgument() {
        System.out.println("Podaj liczbe: ");
        return scanner.nextDouble(); // tutaj pobierz liczbę od użytkownika
    }
}
