package Date.LocalDate;

import java.time.LocalDate;

public class MainLocalDate {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();

        // wartości daty
        System.out.println(localDate); // date format: 0000-00-00
        System.out.println(localDate.getYear()); // 0000
        System.out.println(localDate.getMonthValue()); // 0
        System.out.println(localDate.getDayOfMonth()); // 0
        System.out.println(localDate.getDayOfYear()); // 0
        System.out.println(localDate.getDayOfWeek()); // TUESDAY
        System.out.println(localDate.getMonth()); // MONDAY

        // manipulowanie datą
        localDate = localDate.plusYears(10);
        localDate = localDate.minusMonths(1);
        localDate = localDate.minusDays(10);




    }
}
