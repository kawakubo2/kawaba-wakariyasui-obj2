package chapter21.first;

import java.util.List;
import java.util.Map;

import chapter20.first.PC;

// import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

public class GroupingExample2 {
    public static void main(String[] args) {
        var list = PC.getList();

        // staticインポートしない場合
        // Map<String, List<String>> typeGroup = list.stream()
        // .collect(Collectors.groupingBy(PC::type, Collectors.mapping(PC::name,
        // Collectors.toList())));
        Map<String, List<String>> typeGroup = list.stream()
                .collect(groupingBy(PC::type, mapping(PC::name, toList())));

        typeGroup.forEach((k, v) -> System.out.println(k + " = " + v));
    }
}
