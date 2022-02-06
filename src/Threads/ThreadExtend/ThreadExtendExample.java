package Threads.ThreadExtend;

public class ThreadExtendExample {
    public static void main(String[] args) {

        TestNewThread thread1 = new TestNewThread("thread1", 1000);
        thread1.start();

        TestNewThread thread2 = new TestNewThread("thread2", 700);
        thread2.start();

//        TestNewThread thread3 = new TestNewThread("thread3", 1100);
//        thread3.start();


    }
}
