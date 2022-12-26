package chapter22.first;

import java.time.LocalDate;

public class Calculation {
    public static void main(String[] args) {
        var today = LocalDate.now();
        LocalDate newDay = today.plusDays(150);
        System.out.println(today);
        System.out.println(newDay);
        
        // 3年8月10日後
        LocalDate newDate2 = today.plusYears(3)
                                  .plusMonths(8)
                                  .plusDays(10);
        System.out.println(newDate2);
    }
}
