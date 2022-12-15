package chapter20.second;

import java.util.List;

public class Sample1 {
    public static void main(String[] args) {
        var fruits = List.of("banana", "peach", "apple", "strawberry");
        fruits.stream()
                .sorted()
                .forEach(System.out::println);
    }
    
}
