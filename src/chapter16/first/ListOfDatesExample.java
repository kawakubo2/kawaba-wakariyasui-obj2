package chapter16.first;

import java.time.LocalDate;
import java.util.ArrayList;

public class ListOfDatesExample {
    public static void main(String[] args) {
        var list = new ArrayList<LocalDate>();
        list.add(LocalDate.of(2020, 3, 11));
        list.add(LocalDate.of(2020, 2, 2));
        for (LocalDate date: list) {
            System.out.println(date);
        }
    }
}
