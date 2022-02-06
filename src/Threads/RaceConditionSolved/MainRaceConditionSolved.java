package Threads.RaceConditionSolved;

public class MainRaceConditionSolved {

    public int counter = 0;
    public synchronized void increment() {
//        synchronized (this); // lub gdy synchronized jest ustawione na aktualnym obiekcie
        this.counter++;
    }
    public static void main(String[] args) throws InterruptedException {

        MainRaceConditionSolved example = new MainRaceConditionSolved();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 200_000; i++) {
                    example.increment();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 200_000; i++) {
                    example.increment();
                }
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Counter: " + example.counter);
    }
}
