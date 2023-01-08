package chapter23.first;

import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {
        String data = "月,火,水,木,金";
        String[] dayOfWeek = data.split(",");
        Arrays.stream(dayOfWeek)
            .forEach(System.out::println);
    }
}
