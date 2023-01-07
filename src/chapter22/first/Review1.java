package chapter22.first;

import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;

public class Review1 {
    public static void main(String[] args) {
        System.out.println("--- (1) ---");
        var olympicDate = LocalDate.of(2028, 7, 21);
        JapaneseDate jdate = JapaneseDate.from(olympicDate);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("Gy年M月d日 eee");
        System.out.println(jdate.format(fmt));

        System.out.println("--- (2) ---");
        LocalDate date = LocalDate.of(2022, 2, 1);
        Period p = Period.between(date, olympicDate);
        int years = p.getYears();
        int months = p.getMonths();
        int days = p.getDays();
        System.out.printf("オリンピックまで%d年%d月%d日", years, months, days);

    }
}
