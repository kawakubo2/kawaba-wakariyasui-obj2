package chapter22.first.q22_3_1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Q2 {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2016, 5, 15);
        LocalDate d2 = LocalDate.now();

        long days = ChronoUnit.DAYS.between(d1, d2);
        System.out.println("教室オープンから" + days + "日");
    }
}
