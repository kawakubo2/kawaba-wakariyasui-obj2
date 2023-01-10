package chapter22.second;

import java.time.LocalDate;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;

public class JapaneseFormat {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1890, 1, 8);
        JapaneseDate jdate = JapaneseDate.from(date);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("Gy年MM月dd日(eee)");
        System.out.println(jdate.format(fmt));
    }
}
