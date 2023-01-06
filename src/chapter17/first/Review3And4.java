package chapter17.first;

import java.util.Map;

public class Review3And4 {
    public static void main(String[] args) {
        Map<String, String> fruitMap = Map.of("banana", "バナナ", "cherry", "チェリー", "apple", "リンゴ", "pear", "ナシ", "grape", "ブドウ");
        for (Map.Entry<String, String> entry: fruitMap.entrySet()) {
            System.out.printf("%-15s - %s%n", entry.getKey(), entry.getValue());
        }

        String name1 = "banana";
        String name2 = "pineapple";

        System.out.println(name1 + ": " + fruitMap.get(name1));
        System.out.println(name2 + ": " + fruitMap.getOrDefault(name2, "フルーツ"));
    }
}
