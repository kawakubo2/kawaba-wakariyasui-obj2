package chapter21.second.review;

public class Q4 {
    public static void main(String[] args) {
        var list = Sales.getList();

        long count = list.stream()
            .filter(sales -> (sales.quantity() * sales.pc().price()) >= 100000)
            .count();
        System.out.println(count);
    }
}
