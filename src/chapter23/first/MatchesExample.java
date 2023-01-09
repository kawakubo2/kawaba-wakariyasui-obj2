package chapter23.first;

import java.util.Arrays;
import java.util.List;

public class MatchesExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Jack110", "suzu-10", "Ken3", "tom10", "12345");
        list.stream()
            .filter(s -> s.matches("^(?=.*[A-Z])(?!.*\\W).{5,}$"))
            .forEach(System.out::println);
    }
}
