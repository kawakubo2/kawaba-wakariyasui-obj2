package chapter22.first.q22_3_2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Q1 {
    public static void main(String[] args) {
        TemporalAdjuster firstDayOfNextMonth = TemporalAdjusters.firstDayOfNextMonth();
        TemporalAdjuster secondFriday = TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.FRIDAY);
        LocalDate date = LocalDate.now().with(firstDayOfNextMonth).with(secondFriday);
        System.out.println(date);
    }
}
