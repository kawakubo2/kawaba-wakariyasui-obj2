package chapter21.second;

import chapter20.first.PC;

public class ReduceExample2 {
    public static void main(String[] args) {
        var list = PC.getList();

        String names 
            = list.stream()
                .map(PC::name)
                .reduce("", (a, b) -> a + ", " + b);
        System.out.println(names);
    }
}
