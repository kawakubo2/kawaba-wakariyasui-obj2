package test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 4, 8, -2, 9, 6, 10);

        double total = 0;
        for (int n: numbers) {
            if (n > 0 && n % 2 == 0) {
                total += Math.pow(n, 2) * Math.PI;
            }
        }
        System.out.println(total);

        System.out.println("--- Stream APIを使った場合 ---");
        Optional<Double> total2 = numbers.stream()
                            .filter(n -> n > 0 && n % 2 == 0)
                            .map(r -> Math.pow(r, 2) * Math.PI)
                            .reduce((t, a) -> t + a);
        System.out.println(total2.get());
    }
}
