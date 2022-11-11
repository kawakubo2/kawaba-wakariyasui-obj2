package chapter05.sample2;

import chapter05.Csv;

public record Population(String prefecture, int poplulation, double rate) {
    public Population {
        if (prefecture == null) {
            throw new RuntimeException();
        }
    }
    public Population(String prefecture, int poplulation) {
        this(prefecture, poplulation, 0);
    }
    public boolean isPlus() {
        return rate > 0;
    }
    public static Population of(Csv csv) {
        return new Population(csv.get(0), csv.getInt(1), csv.getDouble(2));
    }
}
