package chapter21;

import java.util.TreeSet;

import chapter20.first.PC;

import static java.util.stream.Collectors.*;

public class ToCollectionExample {
    public static void main(String[] args) {
        var list = PC.getList();

        TreeSet<String> set = list.stream()
                .map(PC::maker)
                .distinct()
                .peek(e -> System.out.printf("%10s", e))
                .collect(toCollection(TreeSet::new));

        System.out.println();
        set.forEach(e -> System.out.printf("%10s", e));
        System.out.println();
    }

}
