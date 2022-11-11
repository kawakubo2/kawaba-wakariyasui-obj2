package chapter05;

public class PopulationSample {
    public static void main(String[] args) {
        Population[] data = {
            new Population("北海道", 5250, -6.8),
            new Population("東京都", 13921, 7.1),
            new Population("大阪府", 8809, -0.4),
            new Population("福岡県", 5104, -0.7),
            new Population("沖縄県", 1453, 3.9)
        };
        for (Population p: data) {
            System.out.printf("%s\t%,7d%7.1f%n",
                p.prefecture(), p.poplulation(), p.rate());
        }
        System.out.println();
    }
}
