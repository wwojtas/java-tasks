package ZMyOwnClass.ZestawCwiczenDlaPoczatkujacych.Interfejsy;

import java.util.ArrayList;
import java.util.Scanner;

public class MainFigure {
    public static void main(String[] args) {

        Figure[] figures = new Figure[3];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj promien: ");
        figures[0] = new Circle(scanner.nextDouble());

        System.out.println("Podaj 1 bok trójkata: ");
        double firstA = scanner.nextDouble();
        System.out.println("Podaj 2 bok trójkata: ");
        double firstB = scanner.nextDouble();
        figures[1] = new Triangle(firstA, firstB);

        System.out.println("Podaj 1 bok prostokąta: ");
        double triangA = scanner.nextDouble();
        System.out.println("Podaj 2 bok prostokąta: ");
        double triangB = scanner.nextDouble();
        figures[2] = new Rectangle(triangA, triangB);

        for (Figure f: figures) {
            System.out.println(f.getArea());
            System.out.println(f.getPetrimeter());
        }

        ArrayList<String> arrayList = new ArrayList<String>();
//        arrayList.stream().map();



    }
}
