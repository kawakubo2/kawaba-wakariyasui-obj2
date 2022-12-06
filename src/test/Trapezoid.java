package test;

public class Trapezoid {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("使用法: java Trapezoid 上底 下底 高さ");
            System.out.println("例: java Trapezoid 4.8 5.2 5.0");
            System.exit(1);
        }
        double upperbase = Double.parseDouble(args[0]);
        double lowerbase = Double.parseDouble(args[1]);
        double height    = Double.parseDouble(args[2]);
        System.out.println("面積" + ((upperbase + lowerbase) * height / 2));
    }
}
