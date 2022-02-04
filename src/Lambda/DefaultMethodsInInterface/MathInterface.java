package Lambda.DefaultMethodsInInterface;


// interfejs funkcjonalny który  ma również metody domyślne
@FunctionalInterface
public interface MathInterface {

    int operate(int a, int b);

    default int add(int a, int b) {
        return a + b;
    }

    default int substract(int a, int b) {
        return a - b;
    }

    default int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        return a / b;
    }


}
