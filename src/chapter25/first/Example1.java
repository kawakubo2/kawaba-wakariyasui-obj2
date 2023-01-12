package chapter25.first;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example1 {
    public static void main(String[] args) {
        try {
            CompletableFuture<String> future
                = CompletableFuture.supplyAsync(() -> "value");
            String msg = future.get();
            System.out.println(msg);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
