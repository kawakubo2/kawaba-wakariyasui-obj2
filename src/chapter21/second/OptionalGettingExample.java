package chapter21.second;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalGettingExample {
    public static void main(String[] args) {
        Optional<String> optName1 = Optional.empty();
        Optional<String> optName2 = Optional.of("ABC");

        String name11 = optName1.orElse("田中宏");
        String name12 = optName1.orElseGet(() -> "田中宏");
        String name21 = optName2.orElse("田中宏");
        String name22 = optName2.orElseGet(() -> "田中宏");

        System.out.println(name11);
        System.out.println(name12);
        System.out.println(name21);
        System.out.println(name22);

        try {
            String name3 = optName1.orElseThrow();
            System.out.println(name3);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
        try {
            String name4 = optName1.orElseThrow(() -> new RuntimeException("値がありません"));
            System.out.println(name4);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
