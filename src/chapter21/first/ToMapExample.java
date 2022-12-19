package chapter21.first;

import java.util.Map;

import chapter20.first.PC;

import static java.util.stream.Collectors.*;

public class ToMapExample {
    public static void main(String[] args) {
        var list = PC.getList();

        Map<String, Integer> pcMap = list.stream()
                .collect(toMap(PC::name, PC::price));
        pcMap.forEach((k, v) -> System.out.println(k + " = " + v));
    }
}
