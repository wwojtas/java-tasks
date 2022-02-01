package Date.compare_date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MainCompareDates {
    public static void main(String[] args) {


        LocalDate date1 = LocalDate.of(2022, 12, 12);
        LocalDate date2 = LocalDate.of(2021, 10, 11);

        date1.isAfter(date2); // true - 2022 jest po  > 2021

        date1.isBefore(date2); // false - 2022 < 2021 - 2022 nie jest przed 2021
        date1.isEqual(date2); //false - nie są sobie równe

        // porównanie LocalDateTime
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.of(2022,11,11,10,12,30);

    }
}
