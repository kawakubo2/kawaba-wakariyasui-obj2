package chapter21.second.review;

public class Q1 {
    public static void main(String[] args) {
        var list = Sales.getList();
        
        int totalPrice
            = list.stream()
                .map(sales -> sales.quantity() * sales.pc().price())
                .reduce(0, (total, sales) -> total + sales);
        System.out.println("売上合計=" + totalPrice);
    }
}
