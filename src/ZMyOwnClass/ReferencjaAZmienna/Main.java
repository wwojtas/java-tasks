package ZMyOwnClass.ReferencjaAZmienna;

public class Main {
    public static void main(String[] args) {


        ObjectFieldsChanging reference1 = new ObjectFieldsChanging(1) ;
//        ObjectFieldsChanging reference2 = reference1;
        ObjectFieldsChanging reference2 = new ObjectFieldsChanging(2) ;


        System.out.println(reference1.getAttribute());
        System.out.println(reference2.getAttribute());

        reference1.setAttribute(11);

        System.out.println(reference1.getAttribute());
        System.out.println(reference2.getAttribute());


    }
}
