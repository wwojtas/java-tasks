package ZMyOwnClass.KlasyAnonimowe;

import ZMyOwnClass.KlasyWewnetrzne.OuterClass;

public class AnonymousCheating {

    private interface SomeInterface{
        void doSomethingUseful();
    }


    public void someMethod(){
        final String finalVariable = "final variable";
        String effectivellyFinalVariable = "effectivelly Final Variable";
        String nonFinalVariable = "non Final Variable";

        class InnerClass{
            public void saySomething(){
                System.out.println(finalVariable);
                System.out.println(effectivellyFinalVariable);
                System.out.println(nonFinalVariable);
            }
        }
        InnerClass innerClass = new InnerClass();
        innerClass.saySomething();
//        nonFinalVariable = "new value";
    }

    public static void main(String[] args) {

        SomeInterface anonymousInstance = new SomeInterface() {
            @Override
            public void doSomethingUseful() {
                System.out.println("I`m doing something useful");
            }
        };
        anonymousInstance.doSomethingUseful();
        System.out.println(anonymousInstance.getClass());
        // wywołanie klasy AnonymousCheating
        AnonymousCheating anonymousCheating = new AnonymousCheating();
        anonymousCheating.someMethod();

        //


    }



}
