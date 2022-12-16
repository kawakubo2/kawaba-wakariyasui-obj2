package chapter20.second;

import chapter20.first.PC;

public class FilterExample {
    public static void main(String[] args) {
        var list = PC.getList();

        list.stream()
            .filter(pc -> "Panan".equals(pc.maker()))
            .forEach(System.out::println);
    }
}
