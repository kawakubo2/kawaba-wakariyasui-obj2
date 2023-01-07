package chapter22.first;

import java.util.stream.Collectors;

public class CharsExample {
    public static void main(String[] args) {
        String str = "ab@cde*fg";

        String result = str.chars()
                .filter(c -> c != '@' && c != '*')
                .mapToObj(c -> String.valueOf((char)c))
                .collect(Collectors.joining());
        System.out.println(result);
    }
}
