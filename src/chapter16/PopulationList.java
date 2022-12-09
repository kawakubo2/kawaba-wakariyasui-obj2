package chapter16;

import java.util.ArrayList;
import java.util.Comparator;

record Population(String prefecture, int population, double rate) {}
public class PopulationList {
    public static void main(String[] args) {
        var list = new ArrayList<Population>();
        list.add(new Population("北海道", 5250, 6.8));
        list.add(new Population("東京都", 13921, 7.1));
        list.add(new Population("大阪府", 8809, 0.4));
        list.add(new Population("福岡県", 5104, 0.7));
        list.add(new Population("沖縄県", 1453, 3.9));

        System.out.println("人口順");
        list.sort(Comparator.comparing(Population::population));
        for (Population p: list) {
            System.out.println(p);
        }
    }
}
