package programs.compoundInterest;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double startCapital = 0;
        double yearlyInterest = 0;
        int numYears = 0;

        double finalCapital;

        System.out.println("Podaj kapitał początkowy: ");
//        startCapital = scanner.nextDouble();
        startCapital = Double.valueOf(scanner.nextLine()).doubleValue();

        System.out.println("Podaj roczne oprocentowanie: ");
//        yearlyInterest = scanner.nextDouble();
        yearlyInterest = Double.valueOf(scanner.nextLine()).doubleValue();

        System.out.println("Wpisz ilosc lat oszczedzania: ");
        numYears = scanner.nextInt();

        finalCapital = startCapital * Math.pow(1 + (yearlyInterest/100.0d), numYears);

        System.out.println("Efekt oszczedzania z procentem składanym: " + Math.round(finalCapital) );


    }
}
