package chapter10;

public class Sum extends Calculation {
    public Sum(double[] dt) {
        super(dt);
    }
    @Override
    public double calculate() {
        double sum = 0.0;
        for (double d: getDt()) {
            sum += d;
        }
        return sum;
    }

    public double average() throws IllegalArgumentException {
        if (getDt().length == 0) {
            throw new IllegalArgumentException("配列が空");
        }
        return calculate() / getDt().length;
    }
    
}
