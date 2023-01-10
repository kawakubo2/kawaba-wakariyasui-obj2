package chapter22.second.q22_4_2;

import java.time.Duration;
import java.time.LocalTime;

public class Q1 {
    public static void main(String[] args) {
        Duration d1 = Duration.between(LocalTime.of(12, 11), LocalTime.of(15, 20));
        Duration d2 = Duration.between(LocalTime.of(15, 56), LocalTime.of(16, 17));
        Duration d3 = Duration.between(LocalTime.of(16, 25), LocalTime.of(16, 31));

        Duration total = d1.plus(d2).plus(d3);
        System.out.printf("所要時間=%d 時間 %d分%n", total.toHoursPart(), total.toMinutesPart());
    }
}
