package Lambda.LambdaBasics;

public class MainLambdaBasics {

    public void test(Addition addition) {
        System.out.println(addition.add(100,50));
    }

    public static void main(String[] args) {

        Addition addition = (int a, int b) -> a + b;

        System.out.println(addition.add(45,23));
        System.out.println(addition.add(1,2));

        MainLambdaBasics mainLambdaBasics = new MainLambdaBasics();
        mainLambdaBasics.test( (a, b) -> a * 2 + b ); // 250

        MathOperation<Float> addition2 = (a, b) -> a + b;
        System.out.println(addition2.operate(10.5f, 6.06f)); // 16.56

        MathOperation<Integer> substract = (a, b) -> a - b;
        System.out.println(substract.operate(100, 80));

    }
}
