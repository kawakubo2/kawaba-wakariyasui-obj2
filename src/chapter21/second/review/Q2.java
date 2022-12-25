package chapter21.second.review;

public class Q2 {
    public static void main(String[] args) {
        var list = Sales.getList();

        int tokyoTotal = list.stream()
            .filter(s -> "東京".equals(s.office()))
            .map(s -> s.quantity() * s.pc().price())
            .reduce(0, (total, price) -> total + price);
        System.out.println("東京の総売上=" + tokyoTotal);
    }
}
