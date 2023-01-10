package chapter22.second;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodExample {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1962, 8, 5);
        LocalDate today = LocalDate.now();
        System.out.println(birthday + "～" + today);

        long days = ChronoUnit.DAYS.between(birthday, today);
        System.out.println("誕生日から" + days + "日");

        Period period = Period.between(birthday, today);
        System.out.println(period.getYears() + "歳");
        System.out.println(period.getMonths() + "か月");
        System.out.println(period.getDays() + "日");

        LocalDate la = LocalDate.of(2028, 7, 21);
        long days2 = ChronoUnit.DAYS.between(today, la);
        System.out.println("ロサンゼルスオリンピックまであと" + days2 + "日");
    }
}
