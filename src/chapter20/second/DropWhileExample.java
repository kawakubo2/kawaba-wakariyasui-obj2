package chapter20.second;

import java.util.List;

public class DropWhileExample {
    public static void main(String[] args) {
        var list = List.of(9, 6, 5, 5, 2, 1, 8, 5, 4, 9);
        list.stream()
            .dropWhile(n -> n >= 5)
            .forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
