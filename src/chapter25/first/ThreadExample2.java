package chapter25.first;

public class ThreadExample2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(
            () -> {
                try {
                    Task task = new Task("thread-1");
                    task.doit();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                }
            }
        );
        t1.start();
        System.out.println("--- main 終了 ---");
    }
}
