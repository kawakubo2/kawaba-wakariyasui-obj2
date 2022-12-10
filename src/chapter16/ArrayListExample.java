package chapter16;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("おはよう");
        list.add("こんにちは");
        list.add("こんばんは");
        for (String ls: list) {
            System.out.println(ls);
        }
    }
}
