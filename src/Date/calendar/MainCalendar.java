package Date.calendar;

import java.util.Calendar;
import java.util.Date;

public class MainCalendar {
    public static void main(String[] args) {

        // pobieramy aktualną datę
        Date dateNow = new Date();
        //
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateNow);
        System.out.println(dateNow);
        // aktualna data
        calendar.add(Calendar.DAY_OF_MONTH, 0);
        calendar.add(Calendar.MONTH, 0);
        calendar.add(Calendar.YEAR, 0);
        calendar.add(Calendar.HOUR, 0);
        calendar.add(Calendar.MINUTE, 0);
        calendar.add(Calendar.SECOND, 0);
        // można modyfikowac datę -
        // wpisać zamiast 0 do przodu lub do tyłu wartość

        // pobieramy aktualny czas
        Date newDate = calendar.getTime();
        System.out.println(newDate);

    }
}
