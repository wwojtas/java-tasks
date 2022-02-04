package Generics.GenericMethod;

import java.util.ArrayList;

public class MainGenericMethod {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(20);
        arr.add(5);
        System.out.println(Util.getLastElement(arr));
    }
}
