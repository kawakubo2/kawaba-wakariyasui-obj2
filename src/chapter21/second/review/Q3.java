package chapter21.second.review;

import static java.util.stream.Collectors.*;

public class Q3 {
    public static void main(String[] args) {
        var list = Sales.getList();

        String pcNames = list.stream()
            .filter(sales -> "大阪".equals(sales.office()))
            .map(sales -> sales.pc().name())
            .distinct()
            .collect(joining(", "));

        System.out.println(pcNames);
    }
}
