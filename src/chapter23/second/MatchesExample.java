package chapter23.second;

import java.util.Arrays;
import java.util.List;

public class MatchesExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Jack110", "Suzu-10", "Ken3", "tom3");
        for (String s: list) {
            if (s.matches("^(?=.*[A-Z])(?!.*\\W).{5,}$")) {
                System.out.println(s);
            }
        }
    }
}
