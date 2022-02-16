package ZMyOwnClass.ZestawCwiczenDlaPoczatkujacych.WyrazeniaLambda;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class EqualsMethod {

    public static void main(String[] args) {

        //Napisz program, który wywoła funkcję equals
        // na instancji klasy Object używając
        // mechanizmu odwoływania się do metody (przy pomocy ::).

        Supplier<Object> objectCreator = Object::new; // to tak samo jak zapis: new Object();
        Object objectInstance = objectCreator.get();
        System.out.println(objectInstance);

        BiPredicate<Object, Object> equalsMethodOnClass = Object::equals;
        System.out.println(equalsMethodOnClass.test(objectInstance, new Object()));

        Predicate<Object> equalsMethodOnObject = objectInstance::equals;
        System.out.println(equalsMethodOnObject.test(new Object()));


    }

}
