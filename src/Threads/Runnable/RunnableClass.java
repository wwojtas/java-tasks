package Threads.Runnable;



public class RunnableClass implements Runnable {

    private int sleepTime;
    private String threadName;

    public RunnableClass(int sleepTime, String threadName) {
        this.sleepTime = sleepTime;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Watek: " + this.threadName + " " + i);
            try {
                Thread.sleep(this.sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
