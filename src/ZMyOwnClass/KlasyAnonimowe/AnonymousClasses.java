package ZMyOwnClass.KlasyAnonimowe;

public class AnonymousClasses {

    public static class Robot{

        private final KlasyAnoniomowe.GreetingModule greetingModule;

        public Robot(KlasyAnoniomowe.GreetingModule greetingModule) {
            this.greetingModule = greetingModule;
        }
        public void saySomething(){
            greetingModule.sayHello();
        }
    }

    public interface GreetingModule{
        void sayHello();
    }

    public static void main(String[] args) {

        Robot jan = new Robot(new KlasyAnoniomowe.GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("dzien dobry - jan");
            }
        });

        Robot john = new Robot(new KlasyAnoniomowe.GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("good morning - john");
            }
        });

        Robot janne = new Robot(new KlasyAnoniomowe.GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("Ich bin Janne Ahonnem");
            }
        });


        jan.saySomething();
        john.saySomething();
        janne.saySomething();
    }



}
