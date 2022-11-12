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
    private double stdDev;
    public StdStat(String str) throws IllegalArgumentException {
        csv = new Csv(str);
        if (csv.size() <= 0) throw new IllegalArgumentException("データが空です。");
        for (int i = 0; i < csv.size(); i++) {
            double val = csv.getDouble(i);
            this.total += val;
            if (val > max) max = val;
            size++;
        }
        this.average = this.total / this.size;
        if (this.max == Double.NEGATIVE_INFINITY)
            throw new IllegalArgumentException();
    }
    public double getTotal() {
        return this.total;
    }
    public double getAverage() {
        return this.average;
    }
    public double getMax() {
        return this.max;
    }
    public int getSize() {
        return this.size;
    }
    public double variant() {
        if (calculated) return variant;
        double sqrSum = 0;
        for (int i = 0; i < this.size; i++) {
            sqrSum += Math.pow(csv.getDouble(i) - average, 2);
        }
        double var = sqrSum / csv.size();
        this.variant = var;
        calculated = true;
        return sqrSum / csv.size();
    }
    public double getStdDev() {
        if (calculated) return stdDev;
        double result = Math.sqrt(variant);
        this.stdDev = result;
        return result;
    }
    @Override
    public String toString() {
        return "StdStat [total=" + total + ", average=" + (this.total / this.size) + ", max=" + max + ", size=" + size + "]";
    }
}