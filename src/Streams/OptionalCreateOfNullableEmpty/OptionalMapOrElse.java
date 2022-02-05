package Streams.OptionalCreateOfNullableEmpty;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalMapOrElse {
    public static void main(String[] args) {

        Integer integer = Integer.valueOf(20);
//        integer = null;

        Optional<Integer> opt = Optional.ofNullable(integer);
        Optional<Integer> opt2 = opt.map( i -> i * 3);
        System.out.println(opt2);
        // jesli chcielibysmy miec wartosc
        System.out.println(opt2.orElse(Integer.valueOf(5)));

        Integer int2 = Integer.valueOf(100);
        Optional<Integer> optInt = Optional.ofNullable(int2);
        optInt.map( i -> i * 2)
                .map( i -> i + 50)
                .map( i -> i / 2);
        optInt.ifPresent(System.out::println); // sprawdza czy optional nie jest pusty i czy ma wartosc


    }
}
