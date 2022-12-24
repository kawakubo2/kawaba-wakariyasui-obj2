package chapter21.second;

import java.util.Optional;

public class OptionalOrExample {
    public static void main(String[] args) {
        Optional<String> opt1 = Optional.of("value");
        Optional<String> opt2 = Optional.empty();

        System.out.println(opt1.or(() -> Optional.of("defaultValue")));
        System.out.println(opt2.or(() -> Optional.of("defaultValue")));
    }
}
