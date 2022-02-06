package Threads.ThreadExtend;

public class TestNewThread extends Thread {

    private int sleepTime;

    public TestNewThread(String name, int sleepTime) {
        super(name);
        this.sleepTime = sleepTime;
    }


    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Wątek - " + this.getName() + " : " + i);
            try {
                sleep(this.sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }

}
