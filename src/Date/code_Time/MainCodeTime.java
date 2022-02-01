package Date.code_Time;

import java.util.Date;

public class MainCodeTime {
    public static void main(String[] args) {


        long start = System.currentTimeMillis();
        try {
            for (int i = 0; i < 10; i++) {
                new Date().getTime();
                Thread.sleep(20);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();

        long timeElapsed = end - start;
        System.out.println("Took time: " + timeElapsed);
    }
}
