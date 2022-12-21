package chapter21.second;

import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.*;
import chapter20.first.PC;

public class GroupingExample {
    public static void main(String[] args) {
        var list = PC.getList();

        Map<String, List<PC>> typeGroup = list.stream()
            .collect(groupingBy(PC::type));

        typeGroup.forEach((k, v) -> { 
            System.out.println("【" + k + "】");
            v.forEach(pc -> System.out.println("\t" + pc));
        });
    }
}
