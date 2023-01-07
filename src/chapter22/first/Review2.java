package chapter22.first;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Review2 {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MM月dd日 eeee");
        TemporalAdjuster secondMonday = TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.MONDAY);
        TemporalAdjuster thirdMonday = TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.MONDAY);

        System.out.print("[成人の日] ");
        LocalDate d1 = LocalDate.of(2025, 1, 1).with(secondMonday);
        System.out.println(d1.format(fmt));

        System.out.print("[海の日　] ");
        LocalDate d2 = LocalDate.of(2025, 7, 1).with(thirdMonday);
        System.out.println(d2.format(fmt));

        System.out.print("[敬老の日] ");
        LocalDate d3 = LocalDate.of(2025, 9, 1).with(thirdMonday);
        System.out.println(d3.format(fmt));

        System.out.print("[体育の日] ");
        LocalDate d4 = LocalDate.of(2025, 10, 1).with(secondMonday);
        System.out.println(d4.format(fmt));

    }
}
