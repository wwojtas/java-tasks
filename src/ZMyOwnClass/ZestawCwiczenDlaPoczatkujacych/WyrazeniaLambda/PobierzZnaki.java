package ZMyOwnClass.ZestawCwiczenDlaPoczatkujacych.WyrazeniaLambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class PobierzZnaki {
    public static void main(String[] args) {

        LinkedList<String> words = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Podaj " + (i + 1) + " wyraz");
            words.add(scanner.nextLine());
        }

        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        System.out.println("Po sortowaniu: ");
        for (String word :
                words) {
            System.out.println(word);
        }

    }
}
