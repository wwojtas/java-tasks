package Files;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadz ilosć liczb do dodania: ");
        int numNumbers = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < numNumbers; i++) {
            System.out.println("Wprowadz kolejna liczbe calkowita: ");
            sum += scanner.nextInt();
        }
        System.out.println("Suma wszystkich liczb: " + sum);
    }
}
