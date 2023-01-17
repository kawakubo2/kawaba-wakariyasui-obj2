package chapter25.first;

import java.util.concurrent.CompletableFuture;

public class Example4 {
    public static void main(String[] args) {
        CompletableFuture
            .supplyAsync(() -> "Value")
            .thenCompose(result -> CompletableFuture.supplyAsync(() -> "★" + result))
            .whenComplete((ret, err) -> {
                if (err == null) System.out.println(ret + "★");
                else System.out.println("エラーです");
            });
    }
}
