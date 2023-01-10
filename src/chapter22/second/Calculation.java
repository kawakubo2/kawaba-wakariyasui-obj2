package chapter22.second;

import java.time.LocalDate;

public class Calculation {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate newDay = today.plusYears(1).plusMonths(2).plusDays(3);
        System.out.println(newDay);

        LocalDate newDay2 = today.minusYears(1).minusMonths(2).minusDays(3);
        System.out.println(newDay2);
    }
}
