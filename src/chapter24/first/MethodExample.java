package chapter24.first;

import java.util.Arrays;

public class MethodExample {
    public static void main(String[] args) {
        Arrays.stream(Color.values())
            .forEach(color -> System.out.println(color.name() + ": " + color.ordinal()));
    }
}
