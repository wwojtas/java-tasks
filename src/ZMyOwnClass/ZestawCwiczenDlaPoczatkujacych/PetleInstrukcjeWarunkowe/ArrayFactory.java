package ZMyOwnClass.ZestawCwiczenDlaPoczatkujacych.PetleInstrukcjeWarunkowe;

public class ArrayFactory {


//    private int x;
    // zad.3
//    public ArrayFactory(int x) {
//        this.x = x;
//    }

    public int[] oneDimension(int x){
        return new int[x];
    }

    public int[][] twoDimension(int x){
        return new int[x][x];
    }

    public int[][] buildTwoDimensions(int x) {
        int[][] array = new int[x][];
        for(int i = 0; i < x; i++) {
            array[i] = new int[x];
        }
        return array;
    }

    // zad. 4
    public static void revertNumber(int x){

        String number = Integer.toString(x);
        String[] actNumber = number.split("");

        for (int i = 0 ; i < actNumber.length ; i++) {
            System.out.println(actNumber[i]);
        }
        System.out.println( "Linia podziału: -------");
        for (int i = actNumber.length - 1 ; i >= 0  ; i--) {
            System.out.println(actNumber[i]);
        }
    }
    // zad.4 - inne rozwiazanie
    private static void printCharPerLine(int number) {
        while (number > 0) {
            int reminder = number % 10;
            number /= 10;
            System.out.println(reminder);
        }
    }

    // 5. odwroc np pies -> seip

    public static void reverseString(String text){
        String[] textNew = text.split("");
        for (int i = 0; i < textNew.length; i++) {
            System.out.print(textNew[i]);
        }
        System.out.println("===");
        for (int i = textNew.length - 1; i >= 0 ; i--) {
            System.out.print(textNew[i]);
        }
    }

    // 6 - liczba w formie binarnej
    public static void printBinary(int number) {
        String binaryReversed = "";
        while (number > 0) {
            // This is isn't optimal ;)
            // Read about StringBuilder/StringBuffer
            binaryReversed += number % 2;
            number /= 2;
        }
//        System.out.println(reverse(binaryReversed));
    }

    // 7. palindrom

    public static boolean isPalindrome(String text){
        char[] textNew = text.toCharArray();
        for (int i = 0; i < textNew.length / 2; i++) {
            char a =  textNew[i];
            char b =  textNew[textNew.length - 1 - i];
            if( a != b ){
                return false;
            }
        }
        return true;
    }

    // 8. macierz jednostkowa
    public int[][] identityMatrix(int x) {
        int[][] matrix = buildTwoDimensions(x);
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                } else {
                    // that line is superfluous, arrays are initialized with default value, 0 in case of int type
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }


    // 9. pobierz a nastepnie wyswietl tablice [1, 2, 3]
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            boolean isLastOne = i == array.length - 1;
            if (isLastOne) {
                System.out.print(array[i]);
            }
            else {
                System.out.print(array[i]);
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // 10. sortowanie
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int current = 0; current < array.length - 1 - i; current++) {
                int next = current + 1;
                if (array[current] > array[next]) {
                    int tmp = array[next];
                    array[next] = array[current];
                    array[current] = tmp;
                }
            }
        }
    }



    public static void main(String[] args) {

//        ArrayFactory.revertNumber(123);
//        ArrayFactory.printCharPerLine(123456);
//        ArrayFactory.reverseString("domek");
//        System.out.println(ArrayFactory.isPalindrome("kajak"));

    }




}
