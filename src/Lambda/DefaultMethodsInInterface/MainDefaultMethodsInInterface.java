package Lambda.DefaultMethodsInInterface;

public class MainDefaultMethodsInInterface {
    public static void main(String[] args) {


        MathInterface math = (int a, int b) -> a * b;

        System.out.println(math.operate(10,30));

        System.out.println(MathInterface.divide(100,5));

        System.out.println(math.add(10,15));

        MathClass mathClass = new MathClass();
        System.out.println(mathClass.operate(100,100));
        System.out.println(mathClass.multiply(20,20));
        System.out.println(mathClass.substract(300,150));
        System.out.println();
    }
}
