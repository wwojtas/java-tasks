package Threads.LiveCycle;

class SomeThread implements Runnable {
    public static synchronized void test() {
        while (true) {
        }
    }
    @Override
    public void run() {
        test();
    }
}

public class MainBlockedState {
    public static void main(String[] args)
    throws InterruptedException{


        Thread thread1 = new Thread(new SomeThread());
        Thread thread2 = new Thread(new SomeThread());

        thread1.start();
        thread2.start();

        System.out.println("Watek 1: " + thread1.getState());  // RUNNABLE
        System.out.println("Watek 2: " + thread2.getState());  // BLOCKED


    }
}
