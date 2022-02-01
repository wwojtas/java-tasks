package Date.dateClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainSimpleDate {
    public static void main(String[] args) {

        //
//        Date date = new Date();
//        System.out.println(date);
//        System.out.println(date.getTime());
//
//        SimpleDateFormat dateFormat =new SimpleDateFormat("HH:mm:ss dd:MM:YYYY");
//        System.out.println(dateFormat.format(date));

        // metoda printf
        System.out.printf("Hello -- %s --  %d --  %f -- %b -- %n  %tc", "World", 12, 45.6f, true, new Date());
        System.out.printf("%n Hello %s %2$tY:%2$tm:%2$td", "World", new Date());

        // godzina T format 00:00:00
        String str = String.format("%n %1$tT", new Date());
        System.out.println(str);

        str = String.format("%n %1$tH-%1$tM-%1$tS", new Date());
        System.out.println(str);
    }
}
