package Lambda.ArraysSortLambda;

import java.util.Arrays;

public class MainArraysSortLambda {
    public static void main(String[] args) {

        String arrStr[] = {"Ford", "Bmw", "Dodge", "Mercedes", "Toyota"};

        Arrays.sort(arrStr, (a, b) -> { return a.length() - b.length(); });
        for (String s : arrStr) {
            System.out.println(s);
        }

    }
}
