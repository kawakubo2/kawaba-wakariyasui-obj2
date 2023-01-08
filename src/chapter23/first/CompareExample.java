package chapter23.first;

import java.util.Arrays;
import java.util.List;

public class CompareExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bb", "ac", "ba");
        list.sort((a, b) -> a.compareToIgnoreCase(b));
        System.out.println(list);
    }
}
