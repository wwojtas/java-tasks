package Threads.Runnable;

class RunnableClass2 extends RunnableClass implements Runnable{

    private Thread thread;

    public RunnableClass2(int sleepTime, String threadName) {
        super(sleepTime, threadName);
    }


    public void start() {
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }
}
