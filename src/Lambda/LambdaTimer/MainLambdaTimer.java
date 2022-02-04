package Lambda.LambdaTimer;

import javax.swing.*;
import java.util.Date;

public class MainLambdaTimer extends JFrame {
    public static void main(String[] args) {


        MainLambdaTimer mainLambdaTimer = new MainLambdaTimer();
        mainLambdaTimer.setTitle("Timer");
        mainLambdaTimer.setSize(300,100);
        mainLambdaTimer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // okienko z możliwością zamknięcia
        // miejsce okienku gdzie wyświetlany jest tekst
        JLabel label = new JLabel();
        mainLambdaTimer.add(label);
        // tworzenie widocznego okienka
        mainLambdaTimer.setVisible(true);

        Timer timer = new Timer(1000, event -> {
            Date date = new Date();
            System.out.println(date.toString());
            label.setText(date.toString());
        });
        //wywołanie odliczania
        timer.start();



    }
}
