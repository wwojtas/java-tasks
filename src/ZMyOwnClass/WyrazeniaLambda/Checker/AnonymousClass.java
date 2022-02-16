package ZMyOwnClass.WyrazeniaLambda.Checker;

public class AnonymousClass {

    public static void main(String[] args) {

        Checker<Integer> isOddAnonymous = new Checker<Integer>() {
            @Override
            public boolean check(Integer object) {
                return object % 2 != 0;
            }
        };
        System.out.println(isOddAnonymous.check(123));
        System.out.println(isOddAnonymous.check(124));

        Checker<Integer> isOddLambda = object ->  object % 2 != 0;



    }



}
