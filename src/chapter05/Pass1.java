package chapter05;

public class Pass1 {
    public static void main(String[] args) {
        StdStat stat = new StdStat("10,7,12,4,11,7");
        System.out.println("合　計=" + stat.getTotal());
        System.out.println("平　均=" + stat.getAverage());
        System.out.println("最大値=" + stat.getMax());
        System.out.println("データ数=" + stat.getSize());
        System.out.println("標準偏差=" + stat.getStdDev());
        System.out.println("分　散=" + stat.getVariant());
    }
}
