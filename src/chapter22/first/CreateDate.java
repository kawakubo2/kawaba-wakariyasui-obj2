package chapter22.first;

import java.time.LocalDate;

public class CreateDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate date = LocalDate.of(2025, 12, 8);
        System.out.println(date);
    }
}
