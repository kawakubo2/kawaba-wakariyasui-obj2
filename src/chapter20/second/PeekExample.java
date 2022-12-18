package chapter20.second;

import java.util.List;

import chapter20.first.PC;

public class PeekExample {
    public static void main(String[] args) {
        var list = PC.getList();
        List<Integer> prices = list.stream()
            .map(PC::price)
            .peek(price -> System.out.printf("%,8d", price))
            .distinct()
            .toList();
        System.out.println();
        prices.forEach(p -> System.out.printf("%,8d", p));
        System.out.println();
    }
}
