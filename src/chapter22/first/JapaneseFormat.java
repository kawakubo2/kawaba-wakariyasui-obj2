package chapter22.first;

import java.time.LocalDate;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;

public class JapaneseFormat {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2021, 7, 13);
        JapaneseDate jdate = JapaneseDate.from(date);
        DateTimeFormatter fmt
            = DateTimeFormatter.ofPattern("Gy年MM月dd日 eee");
        System.out.println(jdate.format(fmt));
    }
}
