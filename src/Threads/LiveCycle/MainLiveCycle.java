package Threads.LiveCycle;

public class MainLiveCycle {
    public static void main(String[] args) {

        Thread thread =new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Working thread");
            }
        });

        System.out.println(thread.getState());  // otrzymamy wartość początkową wątku -  NEW


    }
}
