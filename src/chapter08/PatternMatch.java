package chapter08;

import java.time.LocalDate;

public class PatternMatch {
    public static void main(String[] args) {
        Member member = new StudentMember(100, "田中宏", LocalDate.of(2004, 7, 30));
        if (member instanceof StudentMember s) {
            System.out.println(s.getBirthday());
        }
    }
}
