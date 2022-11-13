package chapter05;

record Seiseki(String name, double eigo, double kokugo, double sugaku) {
    double average() {
        double total = eigo + kokugo + sugaku;
        return total / 3;
    }
}

public class Pass2 {
    public static void main(String[] args) {
        Seiseki[] seisekis = {
            new Seiseki("田中真一", 80, 65, 85),
            new Seiseki("前田はな", 90, 80, 95),
            new Seiseki("中村恵美", 70, 90, 75),
            new Seiseki("木村一郎", 60, 70, 65),
            new Seiseki("鈴木次郎", 85, 65, 70)
        };
        for (Seiseki s: seisekis) {
            System.out.printf("%s%6.1f%6.1f%6.1f%6.1f%n", 
                s.name(), s.eigo(), s.kokugo(), s.sugaku(), s.average());
        }
    }
}
