package chapter21;

import java.util.List;
import java.util.Map;
// import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

import chapter20.PC;

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
