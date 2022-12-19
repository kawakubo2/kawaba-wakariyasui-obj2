package chapter21.first;

import java.util.Map;

import chapter20.first.PC;

import static java.util.stream.Collectors.*;

import java.util.List;

public class GroupingExample {
    public static void main(String[] args) {
        var list = PC.getList();

        Map<String, List<PC>> typeGroup = list.stream()
                .collect(groupingBy(PC::type));
        typeGroup.forEach((k, v) -> System.out.println(k + " = " + v));
    }
}
