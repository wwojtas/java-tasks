package ZMyOwnClass.KlasyWewnetrzne;

public class OuterClass {

    public class InnerClass {
    }

    public InnerClass instantiate() {
        return new InnerClass();
    }

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();

        OuterClass.InnerClass instance1  = outerClass.instantiate();
        OuterClass.InnerClass instance2  = outerClass.new InnerClass();

    }



}
