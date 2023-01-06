package chapter16.second.q16_3_3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

record Population(String prefecture, int population, double rate) {}

public class Q1 {
    public static void main(String[] args) {
        List<Population> list = Arrays.asList(
            new Population("北海道", 5250, 6.8),
            new Population("東京都", 13921, 7.1),
            new Population("大阪府", 8809, 0.4),
            new Population("福岡県", 5104, 0.7),
            new Population("沖縄県", 1453, 3.9)
        );

        list.sort(Comparator.comparing(Population::population));
        for (Population p: list) {
            System.out.println(p);
        }
    }    
}
