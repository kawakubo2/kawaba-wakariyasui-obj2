package chapter21;

import java.util.Set;
import static java.util.stream.Collectors.*;

import chapter20.PC;

public class ToSetExample {
    public static void main(String[] args) {
        var list = PC.getList();
        Set<String> types = list.stream()
                .map(PC::type)
                .collect(toSet());
        types.forEach(System.out::println);
    }
}