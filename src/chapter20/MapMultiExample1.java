package chapter20;

import java.util.List;

public class MapMultiExample1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        list.stream()
                .mapMulti((n, buffer) -> {
                    buffer.accept(n);
                    buffer.accept(n + 5);
                    buffer.accept(n + 10);
                    buffer.accept(n + 15);
                    buffer.accept(n + 20);
                })
                .sorted()
                .forEach(System.out::println);
    }
}
