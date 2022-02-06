package Threads.WaitNotify;

import java.util.LinkedList;

public class House {
    public LinkedList<String> delivery = new LinkedList<>();

    public void waitForDelivery(){
        synchronized (delivery){
            System.out.println("Waiting for delivery");
            while(delivery.isEmpty()){
                try {
                    delivery.wait(); // czeka na powiadomienie innego zsynchronizowanego wątku
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Pizza received" + delivery.poll()); // informacja i zdjęcie z kolekcji LinkedList
        }
    }

    public void pizzaGuy(){
        synchronized (delivery) {
            System.out.println("Pizza delivery");
            delivery.add("Special pizza");
            delivery.notify(); // powiadamia inny zsynchronizowany wątek - wybudzi wątek który czeka
        }
    }
}
