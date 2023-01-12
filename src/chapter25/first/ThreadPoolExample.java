package chapter25.first;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(10);
        es.execute(() -> System.out.println("thread-1"));
        es.execute(() -> System.out.println("thread-2"));
        es.execute(() -> System.out.println("thread-3"));
        es.shutdown();
    }
}
