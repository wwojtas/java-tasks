package Threads.LiveCycle;

class TestThread extends Thread {

    Thread mainThread;

    public TestThread(String name, Thread mainThread) {
        super(name);
        this.mainThread = mainThread;
    }

    @Override
    public void run() {
        System.out.println(getName() + " started");
        try{
            for (int i = 0; i < 3; i++) {
                Thread.sleep(1000);
                System.out.println("Main thread: " + mainThread.getState());  // WAITING - stan wątku głównego
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " finished");
    }
}

public class MainWaitingState {
    public static void main(String[] args)
    throws InterruptedException {

        Thread mainThread = Thread.currentThread(); // główny wątek
        TestThread thread1 = new TestThread("thread1", mainThread);
        thread1.start();
        thread1.join(); // główny wątek main będzie czekał aż wątek thread1 zakończy swoje działanie

        System.out.println("main thread");

    }
}
