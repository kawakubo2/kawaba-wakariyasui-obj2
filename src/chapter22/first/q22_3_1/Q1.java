package chapter22.first.q22_3_1;

import java.time.LocalDate;

public class Q1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        LocalDate date = today.plusYears(2).plusMonths(3);
        System.out.println(date);
    }
}
