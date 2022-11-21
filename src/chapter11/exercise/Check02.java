package chapter11.exercise;

public class Check02 implements CheckNumber {
    @Override
    public boolean test(int n) {
        return n >= 100 || n % 2 == 0;
    }
}
