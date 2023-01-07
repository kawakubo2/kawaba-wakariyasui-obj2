package chapter22.first;

import java.time.Duration;
import java.time.LocalTime;

record Runner(String name, LocalTime start, LocalTime goal) {}

public class Review3 {
    public static void main(String[] args) {
        Runner r1 = new Runner("田中宏", LocalTime.of(9, 12, 30), LocalTime.of(14, 15, 10));        
        Runner r2 = new Runner("鈴木次郎", LocalTime.of(9, 35, 20), LocalTime.of(15, 44, 20));
        printRunner(r1);
        printRunner(r2);
        Duration d1 = diff(r1.start(), r1.goal());
        Duration d2 = diff(r2.start(), r2.goal());
        Duration d3 = d2.minus(d1);
        System.out.print("時間差　");
        printTime(d3);
    }
    public static void printRunner(Runner runner) {
        Duration d = diff(runner.start(), runner.goal());
        System.out.print(runner.name());
        printTime(d);
    }
    public static Duration diff(LocalTime t1, LocalTime t2) {
        return Duration.between(t1, t2);
    }
    public static void printTime(Duration d) {
        System.out.printf("%3d時間%3d分%3d秒%n", 
            d.toHoursPart(),
            d.toMinutesPart(),
            d.toSecondsPart());
    }
}
