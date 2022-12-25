package chapter21.second.review;

public class Q5 {
    public static void main(String[] args) {
        var list = Sales.getList();

        long total = list.stream()
            .filter(sales -> "DELO".equals(sales.pc().maker()))
            .mapToLong(sales -> sales.quantity() * sales.pc().price())
            .sum();
        System.out.println(total);
    }
}
