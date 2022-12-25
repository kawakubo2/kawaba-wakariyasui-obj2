package chapter21.second.review;

import static java.util.stream.Collectors.*;

import java.util.Comparator;
import java.util.Optional;
import java.util.Map.Entry;

public class Q7 {
    public static void main(String[] args) {
        var list = Sales.getList();

        Optional<Entry<String, Integer>> topSales
            = list.stream()
                .collect(groupingBy(Sales::name, summingInt(sales -> sales.quantity() * sales.pc().price())))
                .entrySet()
                .stream()
                .collect(maxBy(Comparator.comparing(e -> e.getValue())));
        System.out.println(topSales.get().getKey() + ": " + topSales.get().getValue());
    }
}
