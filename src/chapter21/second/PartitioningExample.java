package chapter21.second;

import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.*;
import chapter20.first.PC;

public class PartitioningExample {
    public static void main(String[] args) {
        var list = PC.getList();

        Map<Boolean, List<String>> typeGroup =
            list.stream()
                .collect(partitioningBy(
                    pc -> pc.price() > 60000,
                    mapping(PC::name, toList())
                ));
        typeGroup.forEach((k, v) -> System.out.println(k + "=" + v));
    }
}
