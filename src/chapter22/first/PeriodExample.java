package chapter22.first;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodExample {
    public static void main(String[] args) {
        LocalDate birthdate = LocalDate.of(1962, 8, 5);
        LocalDate today = LocalDate.now();

        long days = ChronoUnit.DAYS.between(birthdate, today);
        System.out.println("生年月日から" + days + "日");
        
        Period period = Period.between(birthdate, today);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
}
