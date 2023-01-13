package chapter25.first;

import java.util.concurrent.TimeUnit;

public class Task {
    private String msg;
    public Task(String msg) {
        this.msg = msg;
    }
    public void doit() throws IllegalStateException {
        System.out.println(msg);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new IllegalStateException(); 
        }
    }
}
