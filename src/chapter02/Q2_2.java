package chapter02;

import java.time.LocalDate;

public class Q2_2 {
    public static void main(String[] args) {
        Order order = new Order("ICBK61", LocalDate.of(2025, 7, 11), 2100, 5, true);
        
        System.out.println("変更前");
        System.out.printf("型　番=%s%n", order.getCode());
        System.out.printf("受注日=%s%n", order.getDate());
        System.out.printf("個　数=%d%n", order.getQuantity());

        order.setDate(LocalDate.of(2025,8,30));
        order.setQuantity(12);

        System.out.println("変更後");
        System.out.printf("型　番=%s%n", order.getCode());
        System.out.printf("受注日=%s%n", order.getDate());
        System.out.printf("個　数=%d%n", order.getQuantity());
    }
}
