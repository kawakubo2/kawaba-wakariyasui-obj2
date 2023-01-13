package chapter25.first.q25_1;

import chapter25.first.Task;

public class Q1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            Task task = new Task("★thread-1");
            task.doit();
        });
        Thread t2 = new Thread(() -> {
            Task task = new Task("★thread-2");
            task.doit();
        });
        Thread t3 = new Thread(() -> {
            Task task = new Task("★thread-3");
            task.doit();
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
