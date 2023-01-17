package chapter25.first;

import java.util.concurrent.CompletableFuture;

public class Example5 {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> "AA")
            .thenCombine(
                CompletableFuture.supplyAsync(() -> "BB"),
                (r1, r2) -> r1 + r2
            )
            .whenComplete((ret, err) -> {
                if (err == null) {
                    System.out.println("○" + ret + "○");
                } else {
                    System.out.println("エラーです");
                }
            });

    }
}
