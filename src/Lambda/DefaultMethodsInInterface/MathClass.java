package Lambda.DefaultMethodsInInterface;

public class MathClass implements MathInterface{

    @Override
    public int operate(int a, int b) {
        System.out.println("MathClass operate a + b");
        return a + b;
    }

    @Override
    public int multiply(int a, int b) {
        System.out.println("Mathclass multiply()");
        return a * b;
    }

    @Override
    public int add(int a, int b) {
        return MathInterface.super.add(a, b);
    }

    @Override
    public int substract(int a, int b) {
        return MathInterface.super.substract(a, b);
    }
}
