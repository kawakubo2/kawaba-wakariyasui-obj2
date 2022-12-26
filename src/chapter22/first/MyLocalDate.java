package chapter22.first;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyLocalDate {
    public static LocalDate of(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }
    public static LocalDate parse(String dateStr) {
        String pattern = "^([0-9]{4})[/.-]([0-9]{1,2})[/.-]([0-9]{1,2})";
        Matcher m =  Pattern.compile(pattern).matcher(dateStr);
        if (!m.matches()) {
            throw new IllegalArgumentException("日付形式に誤りがあります: " + dateStr);
        }
        return LocalDate.of(
            Integer.parseInt(m.group(1)),
            Integer.parseInt(m.group(2)),
            Integer.parseInt(m.group(3))
            ); 
    }
}
