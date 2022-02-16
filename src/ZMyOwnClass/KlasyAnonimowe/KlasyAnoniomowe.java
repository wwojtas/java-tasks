package ZMyOwnClass.KlasyAnonimowe;

public class KlasyAnoniomowe {

    public interface GreetingModule {
        void sayHello();
    }

    public class GreetingModuleImpl implements GreetingModule{
        @Override
        public void sayHello() {
            System.out.println("good morning");
        }
    }

//    public void someMethod(){
//        GreetingModule greeting = new GreetingModule() {
//            @Override
//            public void sayHello() {
//                System.out.println("good morning");
//            }
//        };
//    }

    // lub forma poniższa
    public void someMethod(){
        GreetingModule greeting = new GreetingModuleImpl();
    }



}
