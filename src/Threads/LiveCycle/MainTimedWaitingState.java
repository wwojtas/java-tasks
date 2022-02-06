package Threads.LiveCycle;

public class MainTimedWaitingState {
    public static void main(String[] args)
    throws InterruptedException{

        Thread thread =new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        Thread.sleep(100);
        System.out.println("Thread state: " + thread.getState()); // w trakcie działania TIMED_WAITING
    }
}
