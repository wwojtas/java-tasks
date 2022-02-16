package ZMyOwnClass.KlasyAnonimowe;

import java.sql.SQLOutput;
import java.util.*;

public class SortUsersList {
    public static void main(String[] args) {

        List<String> words = new LinkedList<>();


        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj wyraz: ");
            words.add(scanner.next());
        }

        System.out.println("Przed sortowaniem: ");
        for (String word : words) {
            System.out.println(word);
        }

        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        System.out.println("Po sortowaniu: ");
        for (String word : words) {
            System.out.println(word);
        }


    }

}
