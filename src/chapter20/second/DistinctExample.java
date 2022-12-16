package chapter20.second;

import java.util.List;

import chapter20.first.PC;

public class DistinctExample {
    public static void main(String[] args) {
        var list = PC.getList();
        List<String> makers = list.stream()
                                .map(PC::maker)
                                .distinct()
                                .toList();
        makers.forEach(name -> System.out.print(name + " "));
        System.out.println();
    }
}
