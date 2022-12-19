package chapter21.second;

import java.util.Optional;

import chapter20.first.PC;

public class ReduceExample {
    public static void main(String[] args) {
        var list = PC.getList();

        Optional<String> names 
            = list.stream()
                .map(PC::name)
                .reduce((a, b) -> a + ", " + b);
        System.out.println(names.get());
    }
}
