package ZMyOwnClass.WyrazeniaLambda.Checker;

import java.util.function.BiFunction;
import java.util.function.Supplier;
import java.util.function.ToDoubleBiFunction;

public class MainHuman {
    public static void main(String[] args) {

        BiFunction<Integer, String, Human> humanCreator = Human::new;
        Human human = humanCreator.apply(25, "Zenek");
        System.out.println(human.getAge());

    }
}
