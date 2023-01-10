package chapter22.second.q22_3_2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Q1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.of(2023, 8, 15);
        TemporalAdjuster firstDayOfNextMonth = TemporalAdjusters.firstDayOfNextMonth();
        TemporalAdjuster secondFriday = TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.FRIDAY);
        LocalDate date1 = today.with(firstDayOfNextMonth).with(secondFriday);
        System.out.println(date1);
    }
}
