package chapter23.first.q23_3;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        String[] okPattern = { "A123", "_123AB", "A_1234"};
        String[] ngPattern = { "a123", "12345", "#ABC", "ABC1234"};

        System.out.println("---< OKパターン >---");
        Arrays.stream(okPattern)
            .filter(s -> s.matches("^(?=.*[A-Z])(?!.*\\W).{4,6}$"))
            .forEach(System.out::println);

        System.out.println("---< NGパターン >---");
        Arrays.stream(ngPattern)
            .filter(s -> s.matches("^(?=.*[A-Z])(?!.*\\W).{4,6}$"))
            .forEach(System.out::println);
    }
}
