package chapter21.second.review;

import static java.util.stream.Collectors.*;

import java.util.Map;

public class Q6 {
    public static void main(String[] args) {
        var list = Sales.getList();

        Map<String, Integer> salesByPerson
            = list.stream()
                .collect(groupingBy(Sales::name, summingInt(sales -> sales.quantity() * sales.pc().price())));

        salesByPerson.forEach((name, sales) -> System.out.println(name + ": " + sales));
    }
}
