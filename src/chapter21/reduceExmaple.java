package chapter21;

import java.util.List;
import java.util.Optional;

import chapter20.first.PC;

public class reduceExmaple {
    public static void main(String[] args) {
        List<PC> list = PC.getList();

        Optional<String> names = list.stream()
            .map(PC::name)
            .reduce((a, b) -> a + ", " + b);
        System.out.println(names.get());
    }
}
