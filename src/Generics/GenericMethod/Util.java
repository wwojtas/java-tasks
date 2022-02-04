package Generics.GenericMethod;

import java.util.ArrayList;

public class Util {

    public static <T> T getLastElement(ArrayList<T> arr) {
        return arr.get(arr.size() - 1);
    }
}
