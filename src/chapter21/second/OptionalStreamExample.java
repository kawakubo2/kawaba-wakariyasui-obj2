package chapter21.second;

import java.util.List;
import java.util.Optional;

public class OptionalStreamExample {
    public static void main(String[] args) {
        Optional<String> opt = Optional.of("abc");
        List<String> ls = opt.stream()
            .map(String::toUpperCase)
            .toList();

        ls.forEach(System.out::println);
    }
}
