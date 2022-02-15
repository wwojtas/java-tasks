package ZMyOwnClass.KlasyWewnetrzne;

public class OuterClass2 {

    public static class InnerClass2 {
    }

    private InnerClass2 instantiate() {
        return new InnerClass2();
    }

    public static void staticInnerClassInstantiation(){

        OuterClass2 outerClass2 = new OuterClass2();

        OuterClass2.InnerClass2 instance1 = outerClass2.instantiate();
        OuterClass2.InnerClass2 instance2 = new OuterClass2.InnerClass2();
    }

    // przykłądowa metoda interfejsu z z metodą niedomyślną
    // oraz z metodą domyslną
    // interfejs domyślnie ma wartość static - nie musimy wstawiać static !!!
    public static interface Domain{
        public void getMe();
        public default int  metoo(int a) {
            return 34 + a;
        }
    }

}
