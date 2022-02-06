package Threads.LiveCycle;

public class MainRunnableState {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    try {
                        Thread.sleep(1000);
                        System.out.println("Watek: " + i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

            }
        });

        thread.start();
        System.out.println( thread.getState()); // RUNNABLE

    }
}
