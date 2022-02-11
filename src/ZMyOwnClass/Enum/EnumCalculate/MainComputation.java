package ZMyOwnClass.Enum.EnumCalculate;

public class MainComputation {
    public static void main(String[] args) {

        System.out.println(Computation.ADD.perform(1, -5));
        System.out.println(Computation.MULTIPY.perform(78, 56));
        System.out.println(Computation.DIVIDE.perform(45, 6));
        System.out.println(Computation.SUBTRACT.perform(78, 56));
    }
}
