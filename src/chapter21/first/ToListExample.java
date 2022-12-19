package chapter21.first;

import static java.util.stream.Collectors.*;

import java.util.List;

import chapter20.first.PC;

public class ToListExample {
    public static void main(String[] args) {
        var list = PC.getList();
        // 可変リスト
        List<String> mutable = list.stream()
                .map(PC::type)
                .collect(toList());
        mutable.forEach(System.out::println);
        // 不変リスト
        List<String> immutable = list.stream()
                .map(PC::type)
                .collect(toUnmodifiableList());
        immutable.forEach(System.out::println);
    }
}
