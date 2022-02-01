package Date.LocalDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainLocalDateTime {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime); // 2022-02-01T14:00:02.411051100
        // formatowanie daty u czasu
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // wrzucamy sformatowaną datę do Stringa
        String str = dateTimeFormatter.format(localDateTime);
        System.out.println(str); // str =  2022-02-01 14:03:19

        // poszczególne wartości daty
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getDayOfMonth());

        // manipulowanie datą
        localDateTime = localDateTime.plusYears(4);

    }
}
