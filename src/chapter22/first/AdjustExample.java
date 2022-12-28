package chapter22.first;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class AdjustExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 6, 12);
        System.out.println(date);
        
        // 次の月曜日
        TemporalAdjuster nextMonday = TemporalAdjusters.next(DayOfWeek.MONDAY);
        System.out.println(date.with(nextMonday));

        // 月末の日
        TemporalAdjuster lastDay = TemporalAdjusters.lastDayOfMonth();
        System.out.println(date.with(lastDay));
    }
}
