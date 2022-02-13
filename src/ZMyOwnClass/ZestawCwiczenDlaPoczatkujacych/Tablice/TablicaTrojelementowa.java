package ZMyOwnClass.ZestawCwiczenDlaPoczatkujacych.Tablice;

public class TablicaTrojelementowa {

    public double[] get3ElementsOfNumbers(double a, double b, double c){
        double[] tab = {a, b, c};
        double[] tab1 = new double[3];
        for (int i = 3 ; i > 0; i--) {
            tab1[tab.length - i] = tab[i-1];
        }
        return tab1;
    }



    public static void main(String[] args) {

        TablicaTrojelementowa tablicaTrojelementowa = new TablicaTrojelementowa();

        double[] tab = tablicaTrojelementowa.get3ElementsOfNumbers(1,2,3);

        for (int i = 0; i < tab.length ; i++) {
            System.out.println(tab[i]);
        }

    }

}
