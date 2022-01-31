package OOP.inner_class;

class SomeExample {

    private class PrivClass{
        public void printInfo() {
            System.out.println("Message from private inner Class");
        }
    }

    public void run() {
        PrivClass privClass = new PrivClass();
        privClass.printInfo();

        class InnerClass{
            public void printInfo() {
                System.out.println("Message from InnerClass");
            }
        }
        InnerClass innerClass = new InnerClass();
        innerClass.printInfo();
    }

    public class PublicClass {

        public void printInfo() {
            System.out.println("PublicClass");
        }
    }



}
