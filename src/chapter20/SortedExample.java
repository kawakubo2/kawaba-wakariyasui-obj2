package chapter20;

import java.util.Comparator;
import java.util.List;

public class SortedExample {
    public static void main(String[] args) {
        var list = PC.getList();

        // 昇順にソート
        System.out.println("昇順にソート");
        List<PC> sortedList = list.stream()
                .sorted(Comparator.comparing(PC::price))
                .toList();

        sortedList.forEach(System.out::println);

        // 降順にソート
        System.out.println("降順にソート");
        sortedList = list.stream()
                .sorted(Comparator.comparing(PC::price).reversed())
                .toList();

        sortedList.forEach(System.out::println);
    }
}
