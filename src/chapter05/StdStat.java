package chapter05;

/*
 * 練習問題はパフォーマンスが悪いので
 * コンストラクタで基本統計量は計算しておく
 */
public class StdStat {
    private Csv csv;
    private double total;
    private double average;
    private double max = Double.NEGATIVE_INFINITY;
    private int size;
    private boolean calculated;
    private double variant;
    public StdStat(String str) throws IllegalArgumentException {
        csv = new Csv(str);
        if (csv.size() <= 0) throw new IllegalArgumentException("データが空です。");
        for (int i = 0; i < csv.size(); i++) {
            double val = csv.getDouble(i);
            total += val;
            if (val > max) max = val;
            size++;
        }
        average = total / size;
        if (this.max == Double.NEGATIVE_INFINITY)
            throw new IllegalArgumentException();
    }
    public double getTotal() {
        return total;
    }
    public double getAverage() {
        return average;
    }
    public double getMax() {
        return max;
    }
    public int getSize() {
        return size;
    }
    public double getVariant() {
        if (calculated) return variant;
        double sqrSum = 0;
        for (int i = 0; i < this.size; i++) {
            sqrSum += Math.pow(csv.getDouble(i) - average, 2);
        }
        variant = sqrSum / csv.size();
        calculated = true;
        return variant;
    }
    public double getStdDev() {
        if (calculated) return Math.sqrt(variant);
        return Math.sqrt(getVariant());
    }
    @Override
    public String toString() {
        return "StdStat [total=" + total + ", average=" + (this.total / this.size) + ", max=" + max + ", size=" + size + "]";
    }
}