package chapter22.second.q22_3_1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Q1 {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2023, 12, 28);
        LocalDate d2 = LocalDate.now();
       
        System.out.println("---< 問1 >---");
        LocalDate d3 = d1.plusYears(2).plusMonths(3);
        System.out.println(d3);

        System.out.println("---< 問2 >---");
        long days = ChronoUnit.DAYS.between(d2, d1);
        System.out.println(days);

        System.out.println("---< 問3 >---");
        boolean result = d1.isBefore(d2);
        System.out.println(result);
    }
}
