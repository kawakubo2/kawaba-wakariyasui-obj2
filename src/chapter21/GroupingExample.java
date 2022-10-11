package chapter21;

import java.util.Map;
import static java.util.stream.Collectors.*;

import java.util.List;

import chapter20.PC;

public class GroupingExample {
    public static void main(String[] args) {
        var list = PC.getList();

        Map<String, List<PC>> typeGroup = list.stream()
                .collect(groupingBy(PC::type));
        typeGroup.forEach((k, v) -> System.out.println(k + " = " + v));
    }
}
