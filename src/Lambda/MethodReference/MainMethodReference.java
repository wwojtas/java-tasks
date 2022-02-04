package Lambda.MethodReference;

import java.util.function.IntSupplier;

public class MainMethodReference {

    public void test(IntSupplier intSupplier) {
        System.out.println(intSupplier.getAsInt());
    }

    public static void main(String[] args) {


        Object obj = new Object();

        //interfejs funkcyjny
        IntSupplier intSupplier = obj::hashCode;
        System.out.println(intSupplier.getAsInt());

        // nowa instancja
        MainMethodReference mainMethodReference = new MainMethodReference();
        // przekazalismy referencję do metody z Object referencję z hashCode do innej metody
        mainMethodReference.test(intSupplier);

    }


}
