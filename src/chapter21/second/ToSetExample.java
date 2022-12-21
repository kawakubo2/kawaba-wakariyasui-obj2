package chapter21.second;

import static java.util.stream.Collectors.*;

import java.util.Set;

import chapter20.first.PC;

public class ToSetExample {
    public static void main(String[] args) {
        var list = PC.getList();
        
        Set<String> types = list.stream()
            .map(PC::name)
            .collect(toSet());

        types.forEach(System.out::println);
    }
}
