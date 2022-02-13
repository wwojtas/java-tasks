package ZMyOwnClass.ZestawCwiczenDlaPoczatkujacych.TypyProste;

import ZMyOwnClass.ZestawCwiczenDlaPoczatkujacych.PetleInstrukcjeWarunkowe.ArrayFactory;

import java.util.Arrays;
import java.util.Scanner;

public class TypyProste {

    public static void printTab(){

        System.out.println("Podaj wielość tablicy: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] tabN = new int[n];


        System.out.println("Podaj liczby: ");
        for (int i = 0; i < tabN.length; i++) {
            tabN[i] = scanner.nextInt();
        }
        ArrayFactory.bubbleSort(tabN);

        System.out.println("Wyswietlam liczby: ");
        for (int i = 0; i < tabN.length; i++) {
            System.out.println(tabN[i]);
        }
    }

    public static void main(String[] args) {
        TypyProste.printTab();
    }
}
