package chapter22.second;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

record Runner(String name, LocalTime start, LocalTime goal) {}

public class Review1 {
    public static void main(String[] args) {
        LocalDate laOlympic = LocalDate.of(2028, 7, 21);

        System.out.println("=== 問1 ===");
        System.out.println("--- (1) ---");
        JapaneseDate jdate = JapaneseDate.from(laOlympic);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("Gy年M月d日 eee");
        System.out.println(jdate.format(fmt));

        System.out.println("--- (1) ---");
        Period p = Period.between(LocalDate.of(2022, 2, 1), laOlympic);
        System.out.print("オリンピックまで");
        System.out.println(p.getYears() + "年" + p.getMonths() + "月" + p.getDays() + "日");

        System.out.println("=== 問2 ===");
        TemporalAdjuster secondMonday = TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.MONDAY);
        TemporalAdjuster thirdMonday = TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.MONDAY);
        LocalDate seijin = LocalDate.of(2025, 1, 1).with(secondMonday);
        LocalDate umi    = LocalDate.of(2025, 7, 1).with(thirdMonday);
        LocalDate keirou = LocalDate.of(2025, 9, 1).with(thirdMonday);
        LocalDate taiiku = LocalDate.of(2025, 10, 1).with(secondMonday);

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("MM月dd日 eeee");
        System.out.println(seijin.format(fmt2));
        System.out.println(umi.format(fmt2));
        System.out.println(keirou.format(fmt2));
        System.out.println(taiiku.format(fmt2));

        System.out.println("=== 問3 ===");
        Runner runner1 = new Runner("田中宏", 
            LocalTime.of(9, 12, 30), LocalTime.of(14, 15, 10));
        Runner runner2 = new Runner("鈴木次郎", 
            LocalTime.of(9, 35, 20), LocalTime.of(15, 44, 20));
        printRunner(runner1);
        printRunner(runner2);
        printDiff(runner1, runner2);
        
        System.out.println("=== 問4 ===");
        LocalDateTime dt1 = LocalDateTime.of(2025, 2, 21, 13, 0, 0);
        LocalDateTime dt2 = LocalDateTime.of(2026, 5, 7, 10, 15, 30);
        LocalDateTime dt3 = dt1.plusMinutes(3245).plusSeconds(320);
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("y/M/d ahh:mm:ss");
        System.out.println(dt3.format(fmt3));
        Duration diff = Duration.between(dt1, dt2);
        System.out.println("全期間は" + diff.toSeconds() + "秒間");
    }
    public static void printRunner(Runner r) {
        Duration d = Duration.between(r.start(), r.goal());
        System.out.printf("%-4s%3d時間%3d分%3d秒%n",
            r.name(), d.toHoursPart(), d.toMinutesPart(), d.toSecondsPart()
        );
    }
    public static void printDiff(Runner r1, Runner r2) {
        Duration d1 = Duration.between(r1.start(), r1.goal());
        Duration d2 = Duration.between(r2.start(), r2.goal());
        Duration diff = d2.minus(d1);
        System.out.printf("%-4s%3d時間%3d分%3d秒%n", "時間差", 
            diff.toHoursPart(), diff.toMinutesPart(), diff.toSecondsPart());
    }
}
