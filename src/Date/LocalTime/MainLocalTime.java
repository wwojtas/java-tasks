package Date.LocalTime;

import java.time.LocalTime;

public class MainLocalTime {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println("Godzina: " + localTime.getHour());
        System.out.println("Minuty: " + localTime.getMinute());
        System.out.println("Sekundy: " + localTime.getSecond());

        // manipulowanie czasem
        localTime = localTime.plusHours(2);
        localTime = localTime.minusMinutes(12);
        localTime = localTime.minusSeconds(6);
        System.out.println("Godzina: " + localTime.getHour());
        System.out.println("Minuty: " + localTime.getMinute());
        System.out.println("Sekundy: " + localTime.getSecond());


    }
}
