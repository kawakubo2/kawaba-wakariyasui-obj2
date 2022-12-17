package chapter20.second;

import java.util.List;

public class MapMultiExample1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        list.stream()
            .mapMulti((n, buffer) -> {
                buffer.accept(n);
                buffer.accept(n);
                buffer.accept(n);
            })
            .forEach(System.out::print);
        System.out.println();
    }
}
