package chapter18.q18_1_a;

public class MyFunction implements Function<String, Integer> {
    @Override
    public Integer apply(String a) {
        return a.length();
    }
}
