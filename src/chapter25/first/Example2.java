package chapter25.first;

import java.util.concurrent.CompletableFuture;

public class Example2 {
    public static void main(String[] args) {
        CompletableFuture
            .supplyAsync(() -> "value")
            .thenAccept(result -> System.out.println("★" + result));
    }
}
