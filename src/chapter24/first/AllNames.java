package chapter24.first;

import java.util.Arrays;

public class AllNames {
    public static void main(String[] args) {
        Color[] colors = Color.values();
        Arrays.stream(colors)
            .forEach(System.out::println);
    }
}
