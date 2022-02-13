package ZMyOwnClass.ZestawCwiczenDlaPoczatkujacych.PetleInstrukcjeWarunkowe;

public class WyswietlLiczbe {

    public static void retriveNumbersWithForLoop(int x){
        for (int i = 0; i <= x; i++) {
            System.out.println(i);
        }
    }

    public static void retriveNumbersWithWhileLoop(int x){
        int i = 0;
        while(i <= x){
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
        WyswietlLiczbe.retriveNumbersWithForLoop(4);
        WyswietlLiczbe.retriveNumbersWithWhileLoop(5);
    }
}
