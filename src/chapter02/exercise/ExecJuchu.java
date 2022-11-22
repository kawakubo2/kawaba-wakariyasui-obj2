package chapter02.exercise;

import java.time.LocalDate;

public class ExecJuchu {
    public static void main(String[] args) {
        Order order = new Order("ICBK61", LocalDate.of(2025, 7, 11), 2100, 5, true);
        System.out.println("変更前");
        System.out.println("型　番=" + order.getCode());
        System.out.println("受注日=" + order.getDate());
        System.out.println("個数　=" + order.getQuantity());
        
        order.setDate(LocalDate.of(2025, 8, 30));
        order.setQuantity(12);

        System.out.println("変更後");
        System.out.println("型　番=" + order.getCode());
        System.out.println("受注日=" + order.getDate());
        System.out.println("個数　=" + order.getQuantity());
    }
}
