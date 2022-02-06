package Threads.Runnable;

public class MainRunnableExample {
    public static void main(String[] args) {

        RunnableClass t1 = new RunnableClass(500, "thread1");
        Thread thread1 = new Thread(t1, "thread1");
        thread1.start();

        RunnableClass t2 = new RunnableClass(1000, "thread2");
        Thread thread2 = new Thread(t2, "thread2");
        thread2.start();

        RunnableClass2 t3 = new RunnableClass2(300, "thread3");
        t3.start();


    }
}
