package chapter20.second;

import java.util.Comparator;
import java.util.List;

import chapter20.first.PC;

public class SortedExample {
    public static void main(String[] args) {
        var list = PC.getList();
        List<PC> sortedList = list.stream()
                                .sorted(Comparator.comparing(PC::price))
                                .toList();
        sortedList.forEach(System.out::println);
        System.out.println();
    }
}
